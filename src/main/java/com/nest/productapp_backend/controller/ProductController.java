package com.nest.productapp_backend.controller;

import com.nest.productapp_backend.dao.ProductDao;
import com.nest.productapp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage(){
        return "welcome to product home page";
    }
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Product p)
    {
        System.out.println(p.toString());
        dao.save(p);
        return "Product added";
    }

    @PostMapping("/search")
    public String SearchProduct()
    {
        return "Search product";
    }

    @PostMapping("/edit")
    public String EditProduct()
    {
        return "edit product";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> ViewProducts()
    {
        return (List<Product>) dao.findAll();
    }

    @PostMapping("/delete")
    public String DeleteProduct()
    {
        return "Delete product";
    }


}
