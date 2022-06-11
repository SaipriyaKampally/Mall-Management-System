package mallmgmt.products;

public class NonVegDishes {
	private int nonVegId;
	private String name;
	private double price;
	public NonVegDishes(int nonVegId, String name, double price) {
		super();
		this.nonVegId = nonVegId;
		this.name = name;
		this.price = price;
	}
	
	public NonVegDishes(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getNonVegId() {
		return nonVegId;
	}
	public void setNonVegId(int nonVegId) {
		this.nonVegId = nonVegId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "NonVegDishes [nonVegId=" + nonVegId + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
