package com.capg.service;

import java.util.List;

import com.capg.model.Cart;

public interface CartService {
	
	Cart addCart(Cart cart);

	Cart findCartById(long cartId);

	List<Cart> findAllCarts();

	void deleteCartById(long id);

	
}
