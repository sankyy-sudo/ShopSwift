package com.ShopSwift.ShopSwift.ecommerce.repository;

 import com.ShopSwift.ShopSwift.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    // Get products by category
    List<Product> findByCategoryId(Long categoryId);

    // Search products by name or description
    List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
            String name,
            String description
    );
}