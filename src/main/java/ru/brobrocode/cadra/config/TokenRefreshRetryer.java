package ru.brobrocode.cadra.config;

import feign.RetryableException;
import feign.Retryer;
import org.springframework.stereotype.Component;
import ru.brobrocode.cadra.config.exception.TokenExpiredException;

@Component
public class TokenRefreshRetryer implements Retryer {

	private final int maxAttempts;
	private int attempt;

	public TokenRefreshRetryer() {
		this.maxAttempts = 2;
		this.attempt = 1;
	}

	@Override
	public void continueOrPropagate(RetryableException e) {
		if (attempt++ >= maxAttempts) {
			throw e;
		}
		if (e.getCause() instanceof TokenExpiredException) {
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ignored) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public Retryer clone() {
		return new TokenRefreshRetryer();
	}
}
