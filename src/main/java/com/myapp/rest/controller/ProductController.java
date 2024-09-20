package com.myapp.rest.controller;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.rest.api.ProductApi;
import com.myapp.rest.model.Product;
import com.myapp.rest.service.ProductService;

@RestController
public class ProductController implements ProductApi{

	private final ProductService productService;

	public ProductController(ProductService productService) {
		
		this.productService = productService;
	}
	
	
	
	public ResponseEntity<Iterable<Product>> queryProducts(){
		return ok(productService.getAllProducts());
	}
	
	public ResponseEntity<Product> getProduct(String id){
		return productService.getProduct(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	

}
