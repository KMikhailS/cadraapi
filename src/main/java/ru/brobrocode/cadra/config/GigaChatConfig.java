package ru.brobrocode.cadra.config;

import chat.giga.client.GigaChatClient;
import chat.giga.client.auth.AuthClient;
import chat.giga.client.auth.AuthClientBuilder;
import chat.giga.model.Scope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GigaChatConfig {

	@Value("${giga-chat.auth-key}")
	private String authKey;

	@Bean
	public GigaChatClient getGigaChatClient() {
		return GigaChatClient.builder()
				.verifySslCerts(false)
				.authClient(AuthClient.builder()
						.withOAuth(AuthClientBuilder.OAuthBuilder.builder()
								.scope(Scope.GIGACHAT_API_PERS)
								.authKey(authKey)
								.build())
						.build())
				.build();
	}
}
