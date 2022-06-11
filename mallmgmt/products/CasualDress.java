package mallmgmt.products;

public class CasualDress {
	private int casId;
	private String casName;
	private double casPrice;
	
	public CasualDress(){
		
	}

	public CasualDress(String casName, double casPrice) {
		this.casName = casName;
		this.casPrice = casPrice;
	}


	public CasualDress(int casId, String casName, double casPrice) {
		super();
		this.casId = casId;
		this.casName = casName;
		this.casPrice = casPrice;
	}

	public int getCasId() {
		return casId;
	}

	public void setCasId(int casId) {
		this.casId = casId;
	}

	public String getCasName() {
		return casName;
	}

	public void setCasName(String casName) {
		this.casName = casName;
	}

	public double getCasPrice() {
		return casPrice;
	}

	public void setCasPrice(double casPrice) {
		this.casPrice = casPrice;
	}

	@Override
	public String toString() {
		return "CasualDress [casId=" + casId + ", casName=" + casName + ", casPrice=" + casPrice + "]";
	}
	
	
}
