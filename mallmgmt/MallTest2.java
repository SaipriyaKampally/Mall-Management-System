package mallmgmt;

import java.util.ArrayList;
import java.util.Scanner;

import mallmgmt.products.Customer;
import mallmgmt.warehouse.AllNonVegDishes;
import mallmgmt.warehouse.AllVegDishes;
import mallmgmt.warehouse.BillRecord;
import mallmgmt.warehouse.CasualDresses;
import mallmgmt.warehouse.WesternDresses;

public class MallTest2 {
	public static void main(String[] args) {
		int choice, restChoice, kfcChoice, mcDonaldChoice, dressChoice;

		BillRecord bill = new BillRecord();
		WesternDresses wes = new WesternDresses();
		CasualDresses cas = new CasualDresses();
		System.out.println("\t\t\t\tWelcome to Mall.\t\t");
		System.out.println("\t\t\t\t----------------\t\t");

//		OBJECTS**
		Scanner intSc = new Scanner(System.in);
		Scanner stringSc = new Scanner(System.in);

		ArrayList<Customer> customerList = new ArrayList<>();

		System.out.println("First you need to register .");
		int uid = customerList.size() + 1;
		System.out.print("Enter phone Number : ");
		String phno = stringSc.nextLine();
		System.out.print("Enter your name : ");
		String name = stringSc.nextLine();

		Customer customer = new Customer();
		customer.setId(uid);
		customer.setName(name);
		customer.setPhoneNo(phno);

		customerList.add(customer);
		do {

			System.out.println(
					"\nEnter choice for\n1. Restaurant \n2. Dresses\n3. Print your Bill\n");
			choice = intSc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("1. K F C\n2. McDonald");
				restChoice = intSc.nextInt();
				if (restChoice == 1) {
					do {

						System.out.println("1. Veg Dishes KFC\n2. Non-veg Dishes of KFC\n3. Press any key to go back");
						kfcChoice = intSc.nextInt();
						switch (kfcChoice) {
						case 1:
							System.out.println("ViewAll Veg dishes...");
							AllVegDishes.getVegDishesForKFC();

							System.out.print("\nEnter food ID for order.");
							int vegFoodId = intSc.nextInt();

							bill.placeOrderForVegDishes(vegFoodId);
							System.out.println("\nAdded to bill...\n");
							break;
						case 2:
							System.out.println("view all non-veg disghes...");
							AllNonVegDishes.getNonVegDishesForKFC();

							System.out.print("\nEnter food ID for order.");
							int nonVegFoodId = intSc.nextInt();

							bill.placeOrderForNonVegDishes(nonVegFoodId);
							System.out.println("\nAdded to bill...\n");
							break;
						default:
							System.out.println("\nBack...\n");
							break;
						}
					} while (kfcChoice < 3);
				} else if (restChoice == 2) {
					do {

						System.out.println(
								"1. Veg Dishes of McDonald\n2. Non-Veg Dishes of McDonald\n3. Press any key to go back");
						mcDonaldChoice = intSc.nextInt();
						switch (mcDonaldChoice) {
						case 1:
							System.out.println("ViewAll Veg dishes");
							AllVegDishes.getVegDishesForKFC();

							System.out.print("\nEnter food ID for order.");
							int vegFoodId = intSc.nextInt();

							bill.placeOrderForVegDishes(vegFoodId);
							System.out.println("\nAdded to bill...\n");

							break;
						case 2:
							System.out.println("view all non-veg dishes");
							AllNonVegDishes.getNonVegDishesForKFC();

							System.out.print("\nEnter food ID for order.");
							int nonVegFoodId = intSc.nextInt();

							bill.placeOrderForNonVegDishes(nonVegFoodId);
							System.out.println("\nAdded to bill...\n");

							break;
						default:
							System.out.println("Back..\n");
							break;
						}
					} while (mcDonaldChoice < 3);
				}
				break;
//Dress section
			case 2:
				do {
					System.out.println("\nDresses\n==========");
					System.out.println(
							"Select KidsWear only\n----------------------\n1.Western Dress\n2.Casual Dresses\n3. Press any key to back");
					dressChoice = intSc.nextInt();
					switch (dressChoice) {
					case 1:
						System.out.println("\nWestern Dresses\n");
						System.out.println("1. Add Western Dress\n2. View and order dress\n3. remove a dress");
						int wdChoice = intSc.nextInt();
						switch (wdChoice) {
						case 1:
							wes.addWesternDress();
							System.out.println("\nAdded...\n");
							break;
						case 2:
							wes.viewAllWesternDresses();
							System.out.print("\nEnter dress ID for order.");
							int wdDressID = intSc.nextInt();

							bill.placeOrderForWesterndress(wdDressID);
							System.out.println("\nAdded to bill...\n");
							break;

						case 3:
							System.out.println("Enter ID for delete a dress.");
							int id = intSc.nextInt();
							wes.removeDress(id);
							break;
						default:
							System.out.println("\nBack..\n");
						}

						break;
					case 2:
						System.out.println("\nCasual Dress");
						System.out.println("1. Add Casual Dress\n2. View and order dress\n3. remove a dress");
						int casChoice = intSc.nextInt();
						switch (casChoice) {
						case 1:
							cas.addCasualDress();
							break;
						case 2:
							cas.viewAllCasualDresses();
							System.out.print("\nEnter dress ID for order.");
							int casDressID = intSc.nextInt();

							bill.placeOrderForCasualdress(casDressID);
							System.out.println("\nAdded to bill...\n");
							break;
						case 3:
							System.out.println("Enter ID for delete a dress.");
							int id = intSc.nextInt();
							cas.removeDress(id);
							break;
						default:
							System.out.println("Back..");
							break;
						}
						break;
					default:
						System.out.println("Back");
						break;
					}
				} while (dressChoice < 3);
				break;
			case 3:
				String custmName = null;
				for (Customer cust : customerList) {
					custmName = cust.getName();
				}
				System.out.print("\nYour Bill Mr/Mrs. ");
				System.err.print(custmName + "\n");
				System.out.println("=========================");

				bill.fullBill();
				System.out.println("Thank you choosing us");
				System.exit(0);
				break;
			}
		} while (choice < 4);

	}
}
