package com.phfuark.ecommerce.service.category;

import com.phfuark.ecommerce.model.Category;
import com.phfuark.ecommerce.model.Product;

import java.util.List;

public interface CategoryServiceInterface {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
