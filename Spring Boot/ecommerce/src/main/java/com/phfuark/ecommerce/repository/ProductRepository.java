package com.phfuark.ecommerce.repository;

import com.phfuark.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByNameAndBrand(String name, String brand);
    List<Product> findByCategoryAndBrand(String category, String brand);
    List<Product> findByName(String name);

    Long countByNameAndBrand(String name, String brand);
}
