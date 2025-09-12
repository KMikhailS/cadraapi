package ru.brobrocode.cadra.config.exception;

public class RefreshTokenException extends RuntimeException {

	public RefreshTokenException(String message) {
		super(message);
	}

	public RefreshTokenException(String message, Exception exception) {
		super(message, exception);
	}
}
