package com.synchrode.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synchrode.purchase.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
