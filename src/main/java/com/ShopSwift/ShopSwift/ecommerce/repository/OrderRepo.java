package com.ShopSwift.ShopSwift.ecommerce.repository;

import com.ShopSwift.ShopSwift.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}