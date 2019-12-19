package com.target.product.repository;

import com.target.product.productentity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductsEntity, Integer> {
}
