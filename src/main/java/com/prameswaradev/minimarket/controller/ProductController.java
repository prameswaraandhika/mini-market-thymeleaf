package com.prameswaradev.minimarket.controller;

import com.prameswaradev.minimarket.model.Category;
import com.prameswaradev.minimarket.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping
public class ProductController {

    private List<Product> list = new ArrayList<>();

    @GetMapping
    public String showForm(Model model){
        model.addAttribute("product", new Product());
        return "form";
    }

    @ModelAttribute("categories")
    public List<?> getCategories(){
        return List.of(
                new Category(UUID.randomUUID().toString(), "Furniture"),
                new Category(UUID.randomUUID().toString(), "Technology"),
                new Category(UUID.randomUUID().toString(), "Agriculture")
        );
    }

    @PostMapping("/submitProduct")
    public String submitForm(Product product){
        list.add(product);
        return "redirect:/inventory";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model){
        model.addAttribute("products", list);
        return "inventory";
    }



}
