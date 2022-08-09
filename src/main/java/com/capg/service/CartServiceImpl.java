package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dao.CartDao;
import com.capg.model.Cart;

@Transactional
@Component
public class CartServiceImpl  implements CartService{
	
	 @Autowired
	 private CartDao cartDao;

	@Override
	public Cart addCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.save(cart);
	}
	
	@Override
	public List<Cart> findAllCarts() {
		// TODO Auto-generated method stub
		return cartDao.findAll();
	}
	
	@Override
	public Cart findCartById(long id) {
		// TODO Auto-generated method stub
		return cartDao.findById(id).orElse(null);
	}

	@Override
	public void deleteCartById(long id) {
		// TODO Auto-generated method stub
		 cartDao.deleteById(id);
		
	}

	}	


