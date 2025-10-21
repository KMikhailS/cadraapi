package ru.brobrocode.cadra.security;

import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.service.JwtService;
import ru.brobrocode.cadra.service.UserService;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

@Component
@Slf4j
public class OAuth2AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private final JwtService jwtService;
	private final UserService userService;

	@Value("${cadra.dashboard-redirect-uri}")
	private String dashboardRedirectUri;

	public OAuth2AuthenticationSuccessHandler(JwtService jwtService, UserService userService) {
		this.jwtService = jwtService;
		this.userService = userService;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
	                                    HttpServletResponse response,
	                                    Authentication authentication) throws IOException, ServletException {

		// Правильно кастуем к OAuth2AuthenticationToken
		if (!(authentication instanceof OAuth2AuthenticationToken oauthToken)) {
			super.onAuthenticationSuccess(request, response, authentication);
			return;
		}
		OAuth2User oauth2User = oauthToken.getPrincipal();

		// Получаем registrationId (например, "hh")
		String registrationId = oauthToken.getAuthorizedClientRegistrationId();

		// Извлекаем данные пользователя из OAuth2User
		String userId = oauth2User.getName(); // Это значение из user-name-attribute
		Map<String, Object> attributes = oauth2User.getAttributes();

		String email = (String) attributes.get("email");
		String phone = (String) attributes.get("phone");
		String firstName = (String) attributes.get("first_name");
		String lastName = (String) attributes.get("last_name");

		// Сохраняем/обновляем пользователя в БД
		UserInfo user = userService.processOAuthUser(attributes);

		// Создаем claims для JWT
		Map<String, Object> claims = new HashMap<>();
		if (email != null && !email.isEmpty()) {
			claims.put("email", email);
		}
		if (phone != null && !phone.isEmpty()) {
			claims.put("phone", phone);
		}
		claims.put("firstName", firstName);
		claims.put("lastName", lastName);
		claims.put("registrationId", registrationId);
		claims.put("authorities", oauth2User.getAuthorities().stream()
				.map(GrantedAuthority::getAuthority)
				.toList());

		// Генерируем JWT токены
		String accessToken = jwtService.generateAccessToken(user.getId(), claims);
		String refreshToken = jwtService.generateRefreshToken(user.getId());

		// Редирект на фронтенд с токенами
		String targetUrl = UriComponentsBuilder.fromUriString(dashboardRedirectUri)
				.queryParam("token", accessToken)
				.queryParam("refreshToken", refreshToken)
				.build().toUriString();

		getRedirectStrategy().sendRedirect(request, response, targetUrl);
	}
}