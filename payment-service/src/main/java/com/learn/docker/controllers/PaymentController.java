package com.learn.docker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/v1")
public class PaymentController {

	@GetMapping("/initiate")
	public ResponseEntity<String> doPayment() {
		return ResponseEntity.ok("Payment Successful...");
	}

}
