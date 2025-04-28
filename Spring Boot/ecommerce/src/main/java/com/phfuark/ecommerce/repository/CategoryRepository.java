package com.phfuark.ecommerce.repository;

import com.phfuark.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
