package com.AIT.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AIT.Model.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

}
