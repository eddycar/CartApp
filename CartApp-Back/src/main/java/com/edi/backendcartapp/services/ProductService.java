package com.edi.backendcartapp.services;

import com.edi.backendcartapp.models.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
