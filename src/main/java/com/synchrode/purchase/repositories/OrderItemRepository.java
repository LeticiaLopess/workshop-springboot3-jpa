package com.synchrode.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synchrode.purchase.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
