import java.util.Scanner;

/**
 * @author Gavin Fennelly
 * @version 1 Created: 01/005/2016
 * @Last edited: 10/05/2016
 */

public class CommandLineInterface {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] agrs) {
		AVLTree<Pair> myTree1 = new AVLTree<Pair>();
		ReadFile.readFile(myTree1);

		int choice = 0;
		do {
			System.out.println("**********MENU***********");
			System.out.println("1. Add Entry");
			System.out.println("2. Search for an entry");
			System.out.println("3. Print the dictinoary Alphabetically");
			System.out.println("4. Exit");
			System.out.println("> ");
			try {

				choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					addEntry(myTree1);
					break;
				case 2:
					searchEntry(myTree1);
					break;
				case 3:
					printAphabetically(myTree1);
				}

			} catch (NumberFormatException e) {
				choice = 0;
			}
		} while (choice != 4);
		System.out.println("GoodBye");

	}

	public static void addEntry(AVLTree<Pair> myTree1) {

		System.out.println("Enter the new Spanish Word you wish to use:");
		String spanish = sc.nextLine();

		System.out
				.println("Enter the new English translation of the Spanish Word:");
		String english = sc.nextLine();

		myTree1.insert(new Pair(spanish, english));
	}

	public static void searchEntry(AVLTree<Pair> myTree1) {
		System.out.println("Enter a Spanish word to search for");

		String spanish2 = sc.nextLine();

		Pair found = myTree1.search(new Pair(spanish2, null));
		if (found == null) {
			System.out.println("Could not find the word!!!");
		} else {
			System.out.println("spanish:" + found.getSpanishWord());
			System.out.println("english:" + found.getEnglishTranslation());

		}
	}
	
	public static void printAphabetically (AVLTree<Pair> myTree1)
	{
		myTree1.PrintTree();
	}

}
