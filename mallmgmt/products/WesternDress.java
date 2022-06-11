package mallmgmt.products;

public class WesternDress {
	private int wdId;
	private String wdName;
	private double wdPrice;
	
	
	
	public WesternDress(String wdName, double wdPrice) {
		super();
		this.wdName = wdName;
		this.wdPrice = wdPrice;
	}

	public WesternDress(int wdId, String wdName, double wdPrice) {
		super();
		this.wdId = wdId;
		this.wdName = wdName;
		this.wdPrice = wdPrice;
	}
	
	public WesternDress() {
		// TODO Auto-generated constructor stub
	}

	public int getWdId() {
		return wdId;
	}
	public void setWdId(int wdId) {
		this.wdId = wdId;
	}
	public String getWdName() {
		return wdName;
	}
	public void setWdName(String wdName) {
		this.wdName = wdName;
	}
	
	public double getWdPrice() {
		return wdPrice;
	}

	public void setWdPrice(double wdPrice) {
		this.wdPrice = wdPrice;
	}

	@Override
	public String toString() {
		return "WesternDress [wdId=" + wdId + ", wdName=" + wdName + ", wdPrice=" + wdPrice + "]";
	}
	
	

}
