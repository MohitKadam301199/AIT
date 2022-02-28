package com.ait.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.Dao.OrderDao;
import com.ait.Model.Order;



@Service
public class OrderServiceImp implements OrderService{

	@Autowired
	private OrderDao odao;
	
	public List<Order> getOrder() {
		return odao.getOrder();
	}

}
