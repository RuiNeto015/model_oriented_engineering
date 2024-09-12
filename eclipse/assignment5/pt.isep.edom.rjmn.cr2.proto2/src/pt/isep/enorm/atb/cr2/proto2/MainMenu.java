package pt.isep.enorm.atb.cr2.proto2;

import java.math.BigDecimal;

import pt.isep.enorm.atb.cr2.proto2.domain.Article;
import pt.isep.enorm.atb.cr2.proto2.domain.Factory;
import pt.isep.enorm.atb.cr2.proto2.domain.Repository;

public class MainMenu {
	
	public static void executeMenu() {
		boolean exit = false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {
			System.out.println("# Publico Menu #");
			System.out.println("Please select option:");

			System.out.println("0- Exit");
			System.out.println("1- Create Article");
			System.out.println("2- List Articles");
			System.out.println("3- Comment Article");

			// Read an integer from the input
			String line = in.nextLine();
			int num = Integer.valueOf(line);

			switch (num) {
				case 0:
					exit = true;
					break;
				case 1: {
						String title;
						String author;
						String text;
						String date;
						System.out.println("Create Article:");
						System.out.println(" Enter title:");
						title = in.nextLine();
						System.out.println(" Enter author:");
						author = in.nextLine();
						System.out.println(" Enter text:");
						text = in.nextLine();
						System.out.println(" Enter date:");
						date = in.nextLine();
						Article a=Factory.newArticle(title, author, text, date);
						Repository.getRepository().saveArticle(a);
						System.out.println("Article Created!");
					}
					break;
				case 2:
					System.out.println("List of Articles:");
					for (Article a: Repository.getRepository().getArticles()) {
						System.out.println(" " + a.toString());
					}
					System.out.println("End List of Articles.");
					break;
				case 3: {
					String title;
					System.out.println("Comment Article:");
					System.out.println(" Enter title of Article:");
					title = in.nextLine();
					Article a=Repository.getRepository().getArticleByTitle(title);
					if (a==null) {
						System.out.println(" Article title not found!");
					}
					else {
						CommentArticleMenu.executeMenu(title);
					}
				}
				break;					
			}
		}
	}
}
