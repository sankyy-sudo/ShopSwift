package com.ShopSwift.ShopSwift.ecommerce.repository;

import com.ShopSwift.ShopSwift.ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}