package com.synchrode.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synchrode.purchase.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
