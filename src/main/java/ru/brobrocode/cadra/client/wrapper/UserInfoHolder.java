package ru.brobrocode.cadra.client.wrapper;

import org.springframework.stereotype.Component;

@Component
public class UserInfoHolder {
	private final ThreadLocal<String> userInfoHolder = new ThreadLocal<>();

	public void setUserInfo(String userId) {
		this.userInfoHolder.set(userId);
	}

	public void resetUserInfo() {
		userInfoHolder.remove();
	}

	public String getUserInfo() {
		return userInfoHolder.get();
	}
}
