package com.AIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AIT.Model.Payment;
import com.AIT.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService payservice;
	
	@PostMapping("/makePayment")
	public Payment makePayment(@RequestBody Payment payment)
	{
		return payservice.makePayment(payment);
	}

}
