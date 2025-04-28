package com.phfuark.ecommerce.service.product;


import com.phfuark.ecommerce.exception.ProductNotFoundException;
import com.phfuark.ecommerce.repository.ProductRepository;
import com.phfuark.ecommerce.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductServiceInterface {
    private ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()-> new ProductNotFoundException("Product not found!"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        ()-> {new ProductNotFoundException("Product not found!");});
    }

    @Override
    public void updateProductById(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> getProdcutsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryAndBrand(category, brand);
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getProductsByNameAndBrand(String name, String brand) {
        return productRepository.findByNameAndBrand(name, brand);
    }

    @Override
    public Long countProductsByNameAndBrand(String brand, String name) {
        return productRepository.countByNameAndBrand(brand, name);
    }
}
