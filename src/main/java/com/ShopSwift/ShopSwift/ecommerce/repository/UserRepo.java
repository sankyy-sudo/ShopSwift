package com.ShopSwift.ShopSwift.ecommerce.repository;

import com.ShopSwift.ShopSwift.ecommerce.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<user, Long> {

    Optional<user> findByEmail(String email);
}