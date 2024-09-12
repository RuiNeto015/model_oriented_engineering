package pt.isep.enorm.atb.cr2.proto1;

import java.math.BigDecimal;

import pt.isep.enorm.atb.cr2.proto1.domain.Factory;
import pt.isep.enorm.atb.cr2.proto1.domain.Product;
import pt.isep.enorm.atb.cr2.proto1.domain.Repository;

public class MainMenu {
	
	public static void executeMenu() {
		boolean exit = false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {
			System.out.println("# Amazon Menu #");
			System.out.println("Please select option:");

			System.out.println("0- Exit");
			System.out.println("1- Create Product");
			System.out.println("2- List Products");
			System.out.println("3- Review Product");

			// Read an integer from the input
			String line = in.nextLine();
			int num = Integer.valueOf(line);

			switch (num) {
				case 0:
					exit = true;
					break;
				case 1: {
						String name;
						String code;
						String description;
						BigDecimal price;
						System.out.println("Create Product:");
						System.out.println(" Enter name:");
						name = in.nextLine();
						System.out.println(" Enter code:");
						code = in.nextLine();
						System.out.println(" Enter description:");
						description = in.nextLine();
						System.out.println(" Enter price:");
						String StrPrice = in.nextLine();
						price=new BigDecimal(StrPrice);
						Product p=Factory.newProduct(name, code, description, price);
						Repository.getRepository().saveProduct(p);
						System.out.println("Product Created!");
					}
					break;
				case 2:
					System.out.println("List of Products:");
					for (Product p: Repository.getRepository().getProducts()) {
						System.out.println(" " + p.toString());
					}
					System.out.println("End List of Products.");
					break;
				case 3: {
					String name;
					System.out.println("Review Product:");
					System.out.println(" Enter name:");
					name = in.nextLine();
					Product p=Repository.getRepository().getProductByName(name);
					if (p==null) {
						System.out.println(" Product name not found!");
					}
					else {
						ReviewProductMenu.executeMenu();
					}
				}
				break;					
			}
		}
	}
}
