package com.ait.Dao;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ait.Model.Order;

public interface OrderDao {
	
			List<Order> getOrder();

}
