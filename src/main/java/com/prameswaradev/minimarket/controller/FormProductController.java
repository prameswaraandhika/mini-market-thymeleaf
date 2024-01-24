package com.prameswaradev.minimarket.controller;

import com.prameswaradev.minimarket.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping
public class FormProductController {

    @GetMapping
    public String showForm(){
        return "form";
    }

    @ModelAttribute("categories")
    public List<?> getCategories(){
        return List.of(
          new Category(UUID.randomUUID().toString(), "Furniture"),
          new Category(UUID.randomUUID().toString(), "Technology"),
          new Category(UUID.randomUUID().toString(), "Food")
        );
    }
}
