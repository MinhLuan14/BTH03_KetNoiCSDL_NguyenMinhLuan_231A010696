package com.example.lap3KetNoiMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lap3KetNoiMySQL.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
