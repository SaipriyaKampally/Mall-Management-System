package mallmgmt.warehouse;


import java.util.ArrayList;
import java.util.List;

import mallmgmt.products.NonVegDishes;

public class AllNonVegDishes {
	static List<NonVegDishes> nonVegList = new ArrayList<>();
	public static void getNonVegDishesForKFC() {
	
		
		NonVegDishes nveg1 = new NonVegDishes(101,"GRILLEDCHICKEN",130);
		NonVegDishes nveg2 = new NonVegDishes(102,"CHICKENBIRIYANI",180);
		NonVegDishes nveg3 = new NonVegDishes(103,"EGGBIRIYANI",150);
		NonVegDishes nveg4 = new NonVegDishes(104,"MOTTONBIRIYANI",200);
		
		nonVegList.add(nveg1);
		nonVegList.add(nveg2);
		nonVegList.add(nveg3);
		nonVegList.add(nveg4);
		
		System.out.format("%5s%15s%17s","ID","Name","Price");
		System.out.println("\n..........................................");
		for(NonVegDishes nvegDish : nonVegList) {
			System.out.format("%5s%20s%12s",nvegDish.getNonVegId(),nvegDish.getName(),nvegDish.getPrice()+"\n");
		}
//		System.out.format("%5s%15s%7s","ID","Name","Price");
		System.out.println("..........................................");
		
	}
	

}
