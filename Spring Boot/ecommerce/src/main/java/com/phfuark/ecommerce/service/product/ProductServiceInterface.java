package com.phfuark.ecommerce.service.product;

import com.phfuark.ecommerce.model.Product;

import java.util.List;

public interface ProductServiceInterface {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProductById(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProdcutsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByNameAndBrand(String name, String brand);
    Long countProductsByNameAndBrand(String brand, String name);

}
