package ru.brobrocode.cadra.client.yukassa;

public class CallbackProcessingException extends RuntimeException {

	public CallbackProcessingException(String message) {
		super(message);
	}

	public CallbackProcessingException(String message, Exception exception) {
		super(message, exception);
	}
}
