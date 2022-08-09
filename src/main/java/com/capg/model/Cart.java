package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
		 
	 private String name;   
	 private Double price;   
	 private int quantity;  
	 private String pictureUrl;

	 public Cart() {
		  super();
		 }

		 public Cart(String name, Double price, int quantity, 
		    String pictureUrl ) {
		   super();
		   this.name = name;
		   this.price = price;
		   this.quantity = quantity;
		   this.pictureUrl = pictureUrl;
		 }

		 public Long  getId() {
		   return id;
		 }

		 public void setId(long id) {
		   this.id = id;
		 }

		 public String getName() {
		   return name;
		 }

		 public void setName(String name) {
		   this.name = name;
		 }

		 public Double  getPrice() {
		   return price;
		 }

		 public void setPrice(Double price) {
		   this.price = price;
		 }

		 public int  getQuantity() {
		   return quantity;
		 }

		 public void setQuantity(int quantity) {
		   this.quantity = quantity;
		 }

		 public String getPictureUrl() {
		   return pictureUrl;
		 }

		 public void setPictureUrl(String pictureUrl) {
		   this.pictureUrl = pictureUrl;
		 }
}


