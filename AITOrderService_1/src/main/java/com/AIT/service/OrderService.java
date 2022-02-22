package com.AIT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.AIT.Dao.OrderDao;
import com.AIT.Model.Order;
import com.AIT.dto.Payment;
import com.AIT.dto.TransactionResponse;
import com.AIT.dto.TransactionResquest;

@Service
public class OrderService {
	
	@Autowired
	private OrderDao orderdao;
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionResquest tr)
	{
		Order order=tr.getOrder();
		Payment payment=tr.getPayment();
		orderdao.save(order);
		
		payment.setOrderid(order.getOrderNo());
		payment.setAmount(order.getPrice());
		
		
		//Payment payresponse=restTemplate.postForObject("http://localhost:8084/payment/makePayment", payment, Payment.class);
		Payment payresponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/makePayment", payment, Payment.class);
		
		String response;
		if(payresponse.getStatus().equals("sucessful"))
				response="payment successfull and order placed";
		else
			response="Payment failed";
		return new TransactionResponse(order,payresponse.getAmount(), payresponse.getTransactionId(),response);
	}

}
