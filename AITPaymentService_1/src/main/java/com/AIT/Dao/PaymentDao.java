package com.AIT.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AIT.Model.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer>{

}
