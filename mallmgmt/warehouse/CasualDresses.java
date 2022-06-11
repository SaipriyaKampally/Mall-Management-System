package mallmgmt.warehouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import mallmgmt.products.CasualDress;

public class CasualDresses {
	static List<CasualDress> casList = new ArrayList<CasualDress>();
	Scanner sc = new Scanner(System.in);
	CasualDress cd = new CasualDress();
	
	int id = 0;
	
    public CasualDresses() {
    	CasualDress item1 = new CasualDress(1, "Fashion Tringle Dress", 1000);
		casList.add(item1);
		CasualDress item2 = new CasualDress(2, "Mylo", 1500);
		casList.add(item2);
		CasualDress item3 = new CasualDress(3, "Masst & Harbour", 2000);
		casList.add(item3);
	}
	
	public  void addCasualDress() {
		int id = casList.size()+1;
		System.out.print("Item name : ");
		String name = sc.nextLine();
		System.out.print("Item Price");
		double price = sc.nextDouble();
		
		cd.setCasId(id);
		cd.setCasName(name);
		cd.setCasPrice(price);	
		
		casList.add(cd);
	}
	public  void viewAllCasualDresses() {
//		addCasualDress();
		System.out.format("%5s%25s%17s","DressId","WesterDressName","Price");
		System.out.println("\n..........................................");
		for(CasualDress item : casList) {
			id = item.getCasId();
			System.out.format("%5s%30s%15s",item.getCasId(),item.getCasName(),item.getCasPrice()+"\n");
		}
		System.out.println("..........................................");
	}

	public void removeDress(int id) {
//		System.err.println(this.id);
		if(this.id == id) {
			id = id-1;
			casList.remove(id);
		}
		
	}
	

}
