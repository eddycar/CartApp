package com.edi.backendcartapp.repositories;

import com.edi.backendcartapp.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
