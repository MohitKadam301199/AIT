package com.ait.Dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ait.Model.Order;


@Repository
@Transactional
public class OrderDaoImp implements OrderDao{
	
	@Autowired
	private SessionFactory ss;
	
	@Override
	public List<Order> getOrder() {
		ss.getCurrentSession().createQuery("from Order");
		return null;
	}

}
