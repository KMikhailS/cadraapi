package ru.brobrocode.cadra.config.exception;

public class TariffException extends RuntimeException {

	public TariffException(String message) {
		super(message);
	}

	public TariffException(String message, Exception exception) {
		super(message, exception);
	}
}
