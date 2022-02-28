package com.ait.Model;

public class Item {
	
	private int product_id;
	private	String product_name;
	private	int qty;
	private int price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int product_id, String product_name, int qty, int price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.qty = qty;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	@Override
	public String toString() {
		return "Item [product_id=" + product_id + ", product_name=" + product_name + ", qty=" + qty + ", price=" + price
				+ "]";
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
