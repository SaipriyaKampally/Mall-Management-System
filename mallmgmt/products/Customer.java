package mallmgmt.products;

public class Customer {

	private int id;
	private String phoneNo;
	private String name;
	
	
	
	public Customer(int id, String phoneNo, String name) {
		super();
		this.id = id;
		this.phoneNo = phoneNo;
		this.name = name;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", phoneNo=" + phoneNo + ", name=" + name + "]";
	}
	
	
}
