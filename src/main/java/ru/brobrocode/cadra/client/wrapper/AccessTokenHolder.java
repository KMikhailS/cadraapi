package ru.brobrocode.cadra.client.wrapper;

import org.springframework.stereotype.Component;

@Component
public class AccessTokenHolder {
	private final ThreadLocal<String> accessTokenHolder = new ThreadLocal<>();

	public void setAccessToken(String userId) {
		this.accessTokenHolder.set(userId);
	}

	public void resetAccessToken() {
		accessTokenHolder.remove();
	}

	public String getAccessToken() {
		return accessTokenHolder.get();
	}
}
