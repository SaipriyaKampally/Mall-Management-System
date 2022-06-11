package mallmgmt.warehouse;

import java.util.ArrayList;
import java.util.List;

import mallmgmt.products.CasualDress;
import mallmgmt.products.NonVegDishes;
import mallmgmt.products.VegDishes;
import mallmgmt.products.WesternDress;

public class BillRecord {

	List<WesternDress> westernDress = new ArrayList<>();
	List<CasualDress> casualDress = new ArrayList<>();
	List<VegDishes> vegDish = new ArrayList<>();
	List<NonVegDishes> nonVegDish = new ArrayList<>();
	
	List<BillRecord> list = new ArrayList<BillRecord>();

//	WesternDresses wd = new WesternDresses();

	String wdDressName, casDressName, vegDishName, nonVegDishName;
	double wdDressPrice, casDressPrice, vegDishPrice, nonVegDishPrice;

	WesternDress wd ; 
	public void placeOrderForWesterndress(int pID) {
		for (WesternDress li : WesternDresses.wdList) {
			if (li.getWdId() == pID) {
				wd = li;
			}
		}
		if(wd!= null ) {
			wdDressName = wd.getWdName();
			wdDressPrice = wd.getWdPrice();
		}
		else {
			System.out.println("Miss Match");
		}
//		System.out.println(wdDressName + "  * " + wdDressPrice);
	}
	CasualDress cd = null;
	public void placeOrderForCasualdress(int pID) {

		for (CasualDress li : CasualDresses.casList) {
			if(li.getCasId() == pID) {
				cd = li;
			}	
		}
		if(cd != null){
//			System.out.println(cd.getCasName()+", "+cd.getCasPrice());
			casDressName = cd.getCasName();
			casDressPrice = cd.getCasPrice();
		}
		else {
			System.out.println("Miss Match");
		}	
	}
	VegDishes avd = null;
	public void placeOrderForVegDishes(int pID) {
		for(VegDishes li:AllVegDishes.vegList) {
			if(pID == li.getVegId()) {
			avd = li;
			}
		}
		if(avd != null){
//			System.out.println(avd.getName()+", "+avd.getPrice());
			vegDishName = avd.getName();
			vegDishPrice = avd.getPrice();
		}
		else {
			System.out.println("Miss Match");
		}		
	}
	NonVegDishes nvd ; 
	public void placeOrderForNonVegDishes(int pID) {
		for(NonVegDishes li:AllNonVegDishes.nonVegList) {
			if(pID == li.getNonVegId()) {
			nvd = li;
			}
		}
		if(nvd != null) {
			nonVegDishName = nvd.getName();
			nonVegDishPrice = nvd.getPrice();
		}
		else {
			System.out.println("Miss Match");
		}
	}
//
	public void fullBill() {
		vegDish.add(new VegDishes(vegDishName, vegDishPrice));
		nonVegDish.add(new NonVegDishes(nonVegDishName, nonVegDishPrice));
		westernDress.add(new WesternDress(wdDressName, wdDressPrice));
		casualDress.add(new CasualDress(casDressName, casDressPrice));
		
		System.out.println("\n......................................................");
		System.out.format("%4s%20s%25s","SL No.","Item Name","Item_Price\n");
		System.out.println("......................................................");
		int slno = 0;
		double totalPrice  = 0;
		int totalNoOfItems ;
		
		
		
		for(VegDishes vd : vegDish) {
			if(vd.getName() == null) {
				break;
			}
			else {
				slno++;
				totalPrice += vd.getPrice();
				System.out.format("%4s%20s%25s",slno,vd.getName(),vd.getPrice()+"\n");
			}
		}
		for(NonVegDishes nvd : nonVegDish) {
			if(nvd.getName() == null) {
				break;
			}
			else {
				slno++;
				totalPrice += nvd.getPrice();
				System.out.format("%4s%20s%25s",slno,nvd.getName(),nvd.getPrice()+"\n");
			}
		}
		for(WesternDress wd : westernDress) {
			if(wd.getWdName() == null) {
				break;
			}
			else {
				slno++;
				totalPrice += wd.getWdPrice();
				System.out.format("%4s%20s%25s",slno,wd.getWdName(),wd.getWdPrice()+"\n");
			}
		}
		for(CasualDress cd : casualDress) {
			if(cd.getCasName() == null) {
				break;
			}
			else {
				slno++;
				totalPrice += cd.getCasPrice();
				System.out.format("%4s%20s%25s",slno,cd.getCasName(),cd.getCasPrice());
			}
		}
		System.out.println("\n......................................................");
		
		 totalNoOfItems = slno;
		
//			double totalPrice = avd.getPrice()+nvd.getPrice()+wd.getWdPrice()+cd.getCasPrice();
		System.out.format("%5s%32s","TotalNoOfItems = "+totalNoOfItems,"TotalPrice = "+totalPrice);
		System.out.println("\n");
	}
//	

}
