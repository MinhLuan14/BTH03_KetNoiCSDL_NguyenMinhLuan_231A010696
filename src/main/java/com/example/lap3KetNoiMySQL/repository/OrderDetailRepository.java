package com.example.lap3KetNoiMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lap3KetNoiMySQL.models.Order_detail;

@Repository
public interface OrderDetailRepository extends JpaRepository<Order_detail, Long> {

}
