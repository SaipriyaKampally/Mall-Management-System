package mallmgmt.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mallmgmt.products.WesternDress;

public class WesternDresses {
	public static List<WesternDress> wdList = new ArrayList<WesternDress>();
	WesternDress wd = new WesternDress();
	Scanner sc = new Scanner(System.in);
	int id = 0 ; 
	public WesternDresses() {
		WesternDress item1 = new WesternDress(1, "Assymetrical Dress", 1000);
		wdList.add(item1);
		WesternDress item2 = new WesternDress(2, "Aquaa Green Kaftan", 1500);
		wdList.add(item2);
		WesternDress item3 = new WesternDress(3, "Blue Swing Kaftan", 2000);
		wdList.add(item3);
	}
	
	public  void addWesternDress() {
			 id = wdList.size()+1;
			System.out.print("Item name : ");
			String name = sc.nextLine();
			System.out.print("Item Price");
			double price = sc.nextDouble();
			
			wd.setWdId(id);
			wd.setWdName(name);
			wd.setWdPrice(price);	
			
			wdList.add(wd);
	}
	public  void viewAllWesternDresses() {
		
		System.out.format("%5s%25s%17s","DressId","WesterDressName","Price");
		System.out.println("\n..........................................");
		for(WesternDress item : wdList) {
			System.out.format("%5s%30s%15s",item.getWdId(),item.getWdName(),item.getWdPrice()+"\n");
		}
		System.out.println("..........................................");
	}

	public void removeDress(int id) {
		if(this.id == id) {
			id -= 1;
			wdList.remove(id);
			System.out.println("Successfully removed.");
		}
		else {
			System.out.println("You choose wrong item");
		}
		
	}

	

}
