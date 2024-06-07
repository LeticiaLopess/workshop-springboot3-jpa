package com.synchrode.purchase.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synchrode.purchase.entities.Order;
import com.synchrode.purchase.entities.User;
import com.synchrode.purchase.repositories.OrderRepository;
import com.synchrode.purchase.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
