package com.myapp.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapp.rest.api.CartApi;
import com.myapp.rest.api.model.Cart;
import com.myapp.rest.api.model.Item;

import jakarta.validation.Valid;

@RequestMapping("/api/v1/carts")
public class CartsController implements CartApi{

	public CartsController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping
	@Override
	public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) throws Exception {
		// TODO Auto-generated method stub
		return CartApi.super.addCartItemsByCustomerId(customerId, item);
	}
	
	@GetMapping
	@Override
	public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) throws Exception {
		// TODO Auto-generated method stub
		return CartApi.super.getCartByCustomerId(customerId);
	}
	
	@GetMapping
	@Override
	public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) throws Exception {
		// TODO Auto-generated method stub
		return CartApi.super.getCartItemsByItemId(customerId, itemId);
	}
}
