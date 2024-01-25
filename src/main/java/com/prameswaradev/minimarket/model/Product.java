package com.prameswaradev.minimarket.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product{
    private String id;
    private String name;
    private String categoryId;
    private Double price;
    private Double discount;
    private Date date;

}
