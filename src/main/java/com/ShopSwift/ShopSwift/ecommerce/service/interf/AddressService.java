package com.ShopSwift.ShopSwift.ecommerce.service.interf;


import com.ShopSwift.ShopSwift.ecommerce.dto.AddressDto;
import com.ShopSwift.ShopSwift.ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
