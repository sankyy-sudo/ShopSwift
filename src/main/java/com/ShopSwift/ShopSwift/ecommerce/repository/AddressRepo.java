package com.ShopSwift.ShopSwift.ecommerce.repository;

import com.ShopSwift.ShopSwift.ecommerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
