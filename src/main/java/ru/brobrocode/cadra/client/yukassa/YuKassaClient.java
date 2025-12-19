package ru.brobrocode.cadra.client.yukassa;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.client.yukassa.model.*;

@FeignClient(
		name = "yukassa",
		url = "${yukassa.api-url}",
		configuration = YuKassaFeignConfig.class
)
public interface YuKassaClient {

	@PostMapping("/v3/payments")
	PaymentResponse createPayment(
			@RequestHeader("Idempotence-Key") String idempotenceKey,
			@RequestBody PaymentRequest request
	);

	@GetMapping("/v3/payments/{paymentId}")
	PaymentResponse getPayment(@PathVariable("paymentId") String paymentId);

	@PostMapping("/v3/payments/{paymentId}/capture")
	PaymentResponse capturePayment(
			@PathVariable("paymentId") String paymentId,
			@RequestHeader("Idempotence-Key") String idempotenceKey,
			@RequestBody CaptureRequest request
	);

	@PostMapping("/v3/payments/{paymentId}/cancel")
	PaymentResponse cancelPayment(
			@PathVariable("paymentId") String paymentId,
			@RequestHeader("Idempotence-Key") String idempotenceKey
	);

	@PostMapping("/v3/refunds")
	RefundResponse createRefund(
			@RequestHeader("Idempotence-Key") String idempotenceKey,
			@RequestBody RefundRequest request
	);
}
