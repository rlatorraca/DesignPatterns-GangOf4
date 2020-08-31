package Strategy.example02.controller;

public class PayPalAlgorithm implements Payment{

	private String email;
	private String password;
	
	
	
	public PayPalAlgorithm(String email, String password) {
		this.email = email;
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using your PayPal account");
		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
