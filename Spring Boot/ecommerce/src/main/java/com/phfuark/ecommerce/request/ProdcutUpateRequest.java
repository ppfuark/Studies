package com.phfuark.ecommerce.request;

import lombok.Data;
import model.Category;

import java.math.BigDecimal;

@Data
public class ProdcutUpateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
