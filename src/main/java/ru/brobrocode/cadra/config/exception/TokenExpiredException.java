package ru.brobrocode.cadra.config.exception;

public class TokenExpiredException extends RuntimeException {

	public TokenExpiredException(String message) {
		super(message);
	}

	public TokenExpiredException(String message, Exception exception) {
		super(message, exception);
	}
}
