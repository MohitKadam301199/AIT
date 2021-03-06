package com.AIT.dto;


public class Payment {
	
	
	private int paymentId;
	private String status;
	private long debitcardNo;
	private int amount;
	private int orderid;
	private String transactionId;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, String status, long debitcardNo, int amount, int orderid, String transactionId) {
		super();
		this.paymentId = paymentId;
		this.status = status;
		this.debitcardNo = debitcardNo;
		this.amount = amount;
		this.orderid = orderid;
		this.transactionId = transactionId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getDebitcardNo() {
		return debitcardNo;
	}

	public void setDebitcardNo(long debitcardNo) {
		this.debitcardNo = debitcardNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", status=" + status + ", debitcardNo=" + debitcardNo + ", amount="
				+ amount + ", orderid=" + orderid + ", transactionId=" + transactionId + "]";
	}
	
	

}
