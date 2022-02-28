package com.ait.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ait.Dao.CartDao;
import com.ait.Model.Cart;



@Service
public class CartServiceImp implements CartService {

	@Autowired
	private CartDao cdao;
	
	public boolean insertIntoCart(Cart c) {
		
		return cdao.insertIntoCart(c);
	}

}
