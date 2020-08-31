package Strategy.example02;

import Strategy.example02.controller.CreditCardAlgorithm;
import Strategy.example02.controller.PayPalAlgorithm;
import Strategy.example02.model.Product;
import Strategy.example02.model.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product jeans = new Product("111", 50);
		Product sneakers = new Product("234", 150);
		Product hat = new Product("33" , 23);
		
		
		cart.addProduct(hat);
		cart.addProduct(jeans);
		cart.addProduct(sneakers);
		
		//Choose Payment = PayPal
		cart.pay(new PayPalAlgorithm("pedro@uol.com.br", "12121212"));
		
		//Choose Payment = Credit Card
		cart.pay(new CreditCardAlgorithm("Pedro Henrique", "1234 5698 7412 5874"));
		
	}
}
