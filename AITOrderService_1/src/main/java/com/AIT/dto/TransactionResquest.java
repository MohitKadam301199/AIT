package com.AIT.dto;

import com.AIT.Model.Order;

public class TransactionResquest {
	
	private Order order;
	private Payment payment;
	
	public TransactionResquest() {
		// TODO Auto-generated constructor stub
	}

	public TransactionResquest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "TransactionResquest [order=" + order + ", payment=" + payment + "]";
	}
	
	
	

}
