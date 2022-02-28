package com.ait.Dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ait.Model.Cart;




@Repository
@Transactional
public class CartDaoImp implements CartDao{
	
	@Autowired
	private SessionFactory ss;
	
	public boolean insertIntoCart(Cart c) {
		
		ss.getCurrentSession().save(c);
		return true;
	}

	

}
