package com.nest.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page";
    }
    @PostMapping("/add")
    public String AddProduct()
    {
        return "Add product page";
    }

    @PostMapping("/search")
    public String SearchProduct()
    {
        return "Search product";
    }


}
