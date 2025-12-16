package com.ShopSwift.ShopSwift.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int status;
    private String message;
    private LocalDateTime timestamp;

    // Auth
    private String token;
    private String role;
    private String expirationTime;

    // Pagination
    private int totalPage;
    private long totalElement;

    // Single objects
    private AddressDto address;
    private UserDto user;
    private CategoryDto category;
    private ProductDto product;

    // Lists
    private List<UserDto> userList;
    private List<CategoryDto> categoryList;
    private List<ProductDto> productList;
}