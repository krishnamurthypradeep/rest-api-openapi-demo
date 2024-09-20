

package com.myapp.rest.service;

import java.util.Optional;

import org.springframework.validation.annotation.Validated;

import com.myapp.rest.model.Product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Validated
public interface ProductService {

	
	@NotNull Iterable<Product> getAllProducts();
	
	Optional<Product> getProduct(@Min(value=1L,message="Invalid Product Id") String id);
	
	Product save(Product product);
}
