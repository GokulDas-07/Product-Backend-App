package com.nest.productapp_backend.dao;

import com.nest.productapp_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
