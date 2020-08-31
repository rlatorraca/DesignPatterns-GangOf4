package Strategy.example02.model;

public class Product {

	private String upcCode;
	private Integer price;
	
			
	public Product(String upcCode, Integer price) {
		
		this.upcCode = upcCode;
		this.price = price;
	}
	
	public String getUpcCode() {
		return upcCode;
	}
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
