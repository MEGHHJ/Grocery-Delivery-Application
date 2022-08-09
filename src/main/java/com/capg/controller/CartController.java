package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Cart;
import com.capg.service.CartService;

@RestController
@RequestMapping(value = "/cart")
public class CartController {
	
	 @Autowired
	 private CartService cartService;
		
	 @PostMapping("/addCart")
	 public ResponseEntity<Cart> addCart(@RequestBody Cart cart) {
        Cart c = cartService.addCart(cart);
	    return new ResponseEntity<Cart>(c, HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/findAllCarts")
	 public List<Cart> findAllCarts() {
			return cartService.findAllCarts();
		}
	 
	 @GetMapping("/findCartById/{id}")
	 public Cart findCartById(@PathVariable long id) {
			return cartService.findCartById(id);
		}
	 
	 @DeleteMapping("/deleteCartById/{id}")
	 public void deleteCartById(@PathVariable long id) {
	   cartService.deleteCartById(id);
	 }
	 
}
