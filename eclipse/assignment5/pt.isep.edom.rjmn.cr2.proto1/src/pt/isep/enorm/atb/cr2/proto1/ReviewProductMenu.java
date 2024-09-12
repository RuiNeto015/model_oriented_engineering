package pt.isep.enorm.atb.cr2.proto1;

public class ReviewProductMenu {
	
	public static void executeMenu() {
		boolean exit = false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {
			System.out.println("# Review Product Menu #");
			System.out.println("Please select option:");

			System.out.println("0- Exit");
			System.out.println("1- List Product");
			System.out.println("2- List Reviews");
			System.out.println("3- Add Review");

			// Read an integer from the input
			String line = in.nextLine();
			int num = Integer.valueOf(line);
			
			switch (num) {
				case 0:
					exit = true;
					break;
				case 1: {
//					Role role = SFactory.getInstance().getUser();
//					role.execute();
				}
				break;
			}
		}
	}

}
