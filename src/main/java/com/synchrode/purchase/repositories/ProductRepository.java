package com.synchrode.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synchrode.purchase.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
