package com.synchrode.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.synchrode.purchase.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
