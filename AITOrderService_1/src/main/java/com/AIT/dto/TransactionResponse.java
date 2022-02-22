package com.AIT.dto;

import com.AIT.Model.Order;

public class TransactionResponse {
	
	private Order order;
	private int amt;
	private String transactionId;
	private String message;
	
	public TransactionResponse() {
		// TODO Auto-generated constructor stub
	}

	public TransactionResponse(Order order, int amt, String transactionId, String message) {
		super();
		this.order = order;
		this.amt = amt;
		this.transactionId = transactionId;
		this.message = message;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", amt=" + amt + ", transactionId=" + transactionId
				+ ", message=" + message + "]";
	}
	
	
	

}
