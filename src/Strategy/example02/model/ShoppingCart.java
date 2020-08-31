package Strategy.example02.model;

import java.util.ArrayList;
import java.util.List;

import Strategy.example02.controller.Payment;

public class ShoppingCart {

	List<Product> productList;

	public ShoppingCart() {		
		this.productList = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	public Integer calculeCost() {
		int sum = 0;
		for(Product prod : productList) {
			sum += prod.getPrice();
		}
		return sum;
	}
	
	public void pay(Payment paymentStrategy) {
		int amount = calculeCost();
		paymentStrategy.pay(amount);
	}
}
