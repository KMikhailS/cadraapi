package ru.brobrocode.cadra.client.yukassa;

public class YuKassaException extends RuntimeException {

	public YuKassaException(String message) {
		super(message);
	}

	public YuKassaException(String message, Exception exception) {
		super(message, exception);
	}
}
