package com.ait.Model;

import java.util.ArrayList;

import java.util.List;


public class Cart {

	
	private int cart_id;

	
	List<Product> list = new ArrayList<Product>();

	public Cart() {
	}

	public int getCart_id() {
		return cart_id;
	}

	public Cart(int cart_id, List<Product> list) {
		super();
		this.cart_id = cart_id;
		this.list = list;

	}


	public Cart(List<Product> li) {
		this.list=li;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

}
