package com.phfuark.ecommerce.request;

import lombok.Data;
import com.phfuark.ecommerce.model.Category;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}

