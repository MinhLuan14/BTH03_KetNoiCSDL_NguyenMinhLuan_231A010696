package com.example.lap3KetNoiMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lap3KetNoiMySQL.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
