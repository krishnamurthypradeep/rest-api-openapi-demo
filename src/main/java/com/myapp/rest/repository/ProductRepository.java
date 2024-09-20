package com.myapp.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myapp.rest.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
