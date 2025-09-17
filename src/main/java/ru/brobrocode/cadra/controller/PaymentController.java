package ru.brobrocode.cadra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.client.yukassa.model.*;
import ru.brobrocode.cadra.service.YuKassaService;

@RestController
@RequestMapping("payments")
@RequiredArgsConstructor
public class PaymentController {

	private final YuKassaService yuKassaService;

	@PostMapping("/create")
	public ResponseEntity<PaymentResponse> createPayment(@RequestBody CreatePaymentRequest createPaymentRequest) {
		PaymentResponse paymentResponse = yuKassaService.createPayment(createPaymentRequest);
		return ResponseEntity.ok().body(paymentResponse);
	}

	@GetMapping("/{paymentId}")
	public ResponseEntity<PaymentResponse> getPayment(@PathVariable String paymentId) {
		PaymentResponse response = yuKassaService.getPaymentStatus(paymentId);
		return ResponseEntity.ok().body(response);
	}

	@PostMapping("/{paymentId}/capture")
	public ResponseEntity<PaymentResponse> capturePayment(
			@PathVariable String paymentId,
			@RequestBody CapturePaymentDto dto) {
		PaymentResponse response = yuKassaService.capturePayment(paymentId, dto.getAmount());
		return ResponseEntity.ok().body(response);
	}

	@PostMapping("/{paymentId}/refund")
	public ResponseEntity<RefundResponse> refundPayment(
			@PathVariable String paymentId,
			@RequestBody RefundPaymentDto dto) {
		RefundResponse response = yuKassaService.createRefund(paymentId, dto.getAmount());
		return ResponseEntity.ok().body(response);
	}
}