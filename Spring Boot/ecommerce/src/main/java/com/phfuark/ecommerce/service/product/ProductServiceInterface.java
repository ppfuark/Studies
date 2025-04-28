package com.phfuark.ecommerce.service.product;

import com.phfuark.ecommerce.request.ProductUpdateRequest;
import com.phfuark.ecommerce.model.Product;
import com.phfuark.ecommerce.request.AddProductRequest;

import java.util.List;

public interface ProductServiceInterface {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProductById(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByNameAndBrand(String name, String brand);
    Long countProductsByNameAndBrand(String brand, String name);

}
