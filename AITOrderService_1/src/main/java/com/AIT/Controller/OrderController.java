package com.AIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AIT.dto.TransactionResponse;
import com.AIT.dto.TransactionResquest;
import com.AIT.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService oservice;
	
	@PostMapping("/bookOrder")
	public TransactionResponse addOrder(@RequestBody TransactionResquest tr)
	{
		return oservice.saveOrder(tr);
	}

}
