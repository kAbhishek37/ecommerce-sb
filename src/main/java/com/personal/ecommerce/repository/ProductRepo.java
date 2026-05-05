package com.personal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.personal.ecommerce.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
