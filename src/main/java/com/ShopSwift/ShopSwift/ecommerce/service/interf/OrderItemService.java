package com.ShopSwift.ShopSwift.ecommerce.service.interf;


import com.ShopSwift.ShopSwift.ecommerce.dto.OrderRequest;
import com.ShopSwift.ShopSwift.ecommerce.dto.Response;
import com.ShopSwift.ShopSwift.ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}