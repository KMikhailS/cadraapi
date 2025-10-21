package ru.brobrocode.cadra.security;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.endpoint.OAuth2AccessTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import ru.brobrocode.cadra.client.api.OauthApi;

import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private final OauthApi oauthApi;
	private final JwtAuthenticationFilter jwtAuthFilter;
	private final OAuth2AuthenticationSuccessHandler successHandler;
	private final CustomOAuth2UserService customOAuth2UserService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				.csrf(AbstractHttpConfigurer::disable)
				.cors(cors -> cors.configurationSource(corsConfigurationSource()))
				.sessionManagement(session -> session
						.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				)
				.exceptionHandling(exception -> exception
						.authenticationEntryPoint((request, response, authException) -> {
							// Для API endpoints возвращаем 401
							if (request.getRequestURI().startsWith("/api/") ||
								request.getRequestURI().startsWith("/negotiations") ||
								request.getRequestURI().startsWith("/vacancies") ||
								request.getRequestURI().startsWith("/user")) {
								response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
								response.setContentType("application/json");
								response.setCharacterEncoding("UTF-8");
								response.getWriter().write("{\"error\":\"Unauthorized\",\"message\":\"Authentication required\"}");
							} else {
								// Для остальных - редирект на OAuth
								response.sendRedirect("/oauth2/authorization/hh");
							}
						})
				)
				.authorizeHttpRequests(authorize -> authorize
						.requestMatchers(
								"/api/auth/**",
								"/oauth2/**",
								"/login/**",
								"/swagger-ui/**",           // For Swagger UI resources
								"/swagger-ui.html",         // Your custom Swagger UI path
								"/api-docs/**",             // Your custom API docs path
								"/v3/api-docs/**",          // Default OpenAPI docs
								"/actuator/**",
								"/webjars/**",
								"/swagger-resources/**",
								"/callback/payment",
								"/callback/payment/result",
								"/payments",
								"/payments/**",
								"/tariffs",
								"/tariffs/**"
						).permitAll()
						.requestMatchers("/api/**").authenticated()
						.anyRequest().authenticated()
				)
				.oauth2Login(oauth2 -> oauth2
						.loginPage("/oauth2/authorization/hh")
						.tokenEndpoint(token -> token.accessTokenResponseClient(customTokenResponseClient()))
						.userInfoEndpoint(userInfo -> userInfo.userService(customOAuth2UserService))
						.failureUrl("/login?error=true")
						.successHandler(successHandler)
				)
				.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
				.logout(logout -> logout
						.logoutSuccessUrl("/")
						.permitAll()
				);

		return http.build();
	}

	@Bean
	public OAuth2AccessTokenResponseClient<OAuth2AuthorizationCodeGrantRequest> customTokenResponseClient() {
		return new CustomAccessTokenResponseClient(oauthApi);
	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();

		// Разрешенные origins
		configuration.setAllowedOrigins(Arrays.asList(
				"http://localhost:8080",
				"http://localhost:8081",
				"http://localhost:5173",
				"http://localhost:3000",
				"https://cadra.online"
		));

		// Разрешенные методы
		configuration.setAllowedMethods(Arrays.asList(
				"GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD"
		));

		// Разрешенные заголовки
		configuration.setAllowedHeaders(Arrays.asList("*"));

		// Заголовки, которые клиент может читать
		configuration.setExposedHeaders(Arrays.asList(
				"Authorization", "Cache-Control", "Content-Type"
		));

		// Разрешить credentials
		configuration.setAllowCredentials(true);

		// Время кеширования preflight запросов
		configuration.setMaxAge(3600L);

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}
