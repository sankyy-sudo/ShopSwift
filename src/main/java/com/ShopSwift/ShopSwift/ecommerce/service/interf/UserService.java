package com.ShopSwift.ShopSwift.ecommerce.service.interf;


import com.ShopSwift.ShopSwift.ecommerce.dto.LoginRequest;
import com.ShopSwift.ShopSwift.ecommerce.dto.Response;
import com.ShopSwift.ShopSwift.ecommerce.dto.UserDto;
import com.ShopSwift.ShopSwift.ecommerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
