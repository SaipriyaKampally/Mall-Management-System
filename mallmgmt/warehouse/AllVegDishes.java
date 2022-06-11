package mallmgmt.warehouse;


import java.util.ArrayList;
import java.util.List;

import mallmgmt.products.VegDishes;

public class AllVegDishes {
	static List<VegDishes> vegList = new ArrayList<>();
	public static void getVegDishesForKFC() {
		
		
		VegDishes veg1 = new VegDishes(101,"ALOOTIKKI",100);
		VegDishes veg2 = new VegDishes(102,"MANCHURIAN",120);
		VegDishes veg3 = new VegDishes(103,"KADAPANEER",150);
		VegDishes veg4 = new VegDishes(104,"KADAIMASHROOM",130);
		VegDishes veg5 = new VegDishes(105,"MASALAPANEER",145);
		
		vegList.add(veg1);
		vegList.add(veg2);
		vegList.add(veg3);
		vegList.add(veg4);
		vegList.add(veg5);
		
		System.out.format("%5s%15s%17s","ID","Name","Price");
		System.out.println("\n..........................................");
		for(VegDishes vegDish : vegList) {
			System.out.format("%5s%20s%12s",vegDish.getVegId(),vegDish.getName(),vegDish.getPrice()+"\n");
		}
//		System.out.format("%5s%15s%7s","ID","Name","Price");
		System.out.println("..........................................");
		
	}
	

}
