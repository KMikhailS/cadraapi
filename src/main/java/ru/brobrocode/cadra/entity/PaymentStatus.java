package ru.brobrocode.cadra.entity;

public enum PaymentStatus {
	CREATED("created"),
	PENDING("pending"),
	WAITING_FOR_CAPTURE("waiting_for_capture"),
	SUCCEEDED("succeeded"),
	CANCELED("canceled");

	private final String value;

	PaymentStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static PaymentStatus fromString(String value) {
		if (value == null) {
			return CREATED;
		}
		for (PaymentStatus status : PaymentStatus.values()) {
			if (status.value.equalsIgnoreCase(value)) {
				return status;
			}
		}
		return CREATED;
	}
}
