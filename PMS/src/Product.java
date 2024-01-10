
public class Product {

	private String name;
	private int price;
	private String category;
	private int quantity;
	
	
	public Product(String name, int price, String category, int quantity) {
		
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity + "]";
	}


	public String getName() {
		return name;
	}


	


	public int getPrice() {
		return price;
	}




	public String getCategory() {
		return category;
	}


	

	public int getQuantity() {
		return quantity;
	}


	
	
	
	
	
	
}
