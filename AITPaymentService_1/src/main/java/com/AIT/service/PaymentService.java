package com.AIT.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.AIT.Dao.PaymentDao;
import com.AIT.Model.Payment;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentDao pdao;
	
	public Payment makePayment(Payment payment)
	{
	    String transactionid=(UUID.randomUUID().toString());
	    payment.setTransactionId(transactionid);
	    
	    boolean issuccess=new Random().nextBoolean();
	    payment.setStatus(issuccess?"successful":"Failed");
	    pdao.save(payment);
		return payment;
	}

}
