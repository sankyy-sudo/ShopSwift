package com.ShopSwift.ShopSwift.ecommerce.service.interf;


import com.ShopSwift.ShopSwift.ecommerce.dto.CategoryDto;
import com.ShopSwift.ShopSwift.ecommerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
