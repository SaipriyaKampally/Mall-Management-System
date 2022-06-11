package mallmgmt.products;

public class VegDishes {
	private int vegId;
	private String name;
	private double price;
	
	
	public VegDishes(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public VegDishes(int vegId, String name, double price) {
		super();
		this.vegId = vegId;
		this.name = name;
		this.price = price;
	}
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
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
		return "VegDishes [vegId=" + vegId + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
