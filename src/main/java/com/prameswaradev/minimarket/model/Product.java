package com.prameswaradev.minimarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product{
    private String id;
    private String name;
    private String categoryId;
    private Double price;
    private Double discount;

}
