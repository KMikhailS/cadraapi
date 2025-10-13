package ru.brobrocode.cadra.security;

import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;
import ru.brobrocode.cadra.service.JwtService;
import ru.brobrocode.cadra.service.UserService;

import java.io.IOException;
import java.util.*;

@Component
@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private final JwtService jwtService;
	private final UserService userService;

	public JwtAuthenticationFilter(JwtService jwtService, UserService userService) {
		this.jwtService = jwtService;
		this.userService = userService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request,
	                                HttpServletResponse response,
	                                FilterChain filterChain) throws ServletException, IOException {

		String authHeader = request.getHeader("Authorization");

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}

		String token = authHeader.substring(7);

		try {
			if (jwtService.validateToken(token)) {
				// Извлекаем данные из JWT
				Claims claims = jwtService.extractClaims(token);
				String userId = claims.getSubject();
				String email = claims.get("email", String.class);
				String firstName = claims.get("firstName", String.class);
				String lastName = claims.get("lastName", String.class);
				String registrationId = claims.get("registrationId", String.class);
				List<String> authorities = claims.get("authorities", List.class);

				// Загружаем пользователя из БД
				UserInfo user = userService.findById(userId);

				// Создаем атрибуты для OAuth2User
				Map<String, Object> attributes = new HashMap<>();
				attributes.put("id", user.getId());
				attributes.put("email", email);
				attributes.put("first_name", firstName);
				attributes.put("last_name", lastName);
				attributes.put("internalUserId", user.getId());

				// Создаем authorities
				Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
				if (authorities != null) {
					authorities.forEach(auth ->
							grantedAuthorities.add(new SimpleGrantedAuthority(auth))
					);
				} else {
					grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
				}

				// Создаем OAuth2User
				OAuth2User oauth2User = new DefaultOAuth2User(
						grantedAuthorities,
						attributes,
						"id" // nameAttributeKey - должен совпадать с вашей конфигурацией
				);

				// Создаем OAuth2AuthenticationToken (НЕ UsernamePasswordAuthenticationToken!)
				OAuth2AuthenticationToken authenticationToken = new OAuth2AuthenticationToken(
						oauth2User,
						grantedAuthorities,
						registrationId != null ? registrationId : "hh"
				);

				// Устанавливаем в SecurityContext
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);

				log.info("JWT authentication successful for user: {}", userId);
			} else {
				// Токен невалидный - возвращаем 401
				log.info("Invalid JWT token for request: {}", request.getRequestURI());
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write("{\"error\":\"Unauthorized\",\"message\":\"JWT token expired or invalid\"}");
				return;
			}
		} catch (Exception e) {
			log.error("JWT authentication failed", e);
			// Возвращаем 401 вместо продолжения обработки
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write("{\"error\":\"Unauthorized\",\"message\":\"JWT token expired or invalid\"}");
			return;
		}
		filterChain.doFilter(request, response);
	}

	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) {
		// Не фильтруем публичные endpoints
		String path = request.getServletPath();
		return path.startsWith("/oauth2/") ||
				path.startsWith("/login/") ||
				path.equals("/auth/refresh");
	}
}