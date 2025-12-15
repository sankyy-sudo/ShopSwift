package com.ShopSwift.ShopSwift.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemDto {

    private Long id;
    private int quantity;
    private BigDecimal price;

    // Flattened references (BEST PRACTICE)
    private Long userId;
    private Long productId;
    private Long orderId;

    private LocalDateTime createdAt;
}