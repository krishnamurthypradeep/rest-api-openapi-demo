package com.myapp.rest.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.myapp.rest.model.Product;
import com.myapp.rest.repository.ProductRepository;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	private final ProductRepository productRepository;
	
	

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public @NotNull Iterable<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProduct(@Min(value = 1, message = "Invalid Product Id") String id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	

}
