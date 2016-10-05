import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	private static Scanner sc = new Scanner(System.in);

	public static void readFile(AVLTree<Pair> myTree1) {
		BufferedReader br = null;
		// Just in case of an error it will catch it
		try {
			// Reads whatever is in the SpanishWords.txt file to the console
			// window
			br = new BufferedReader(new FileReader("SpanishWords.txt"));
			// reads one line of text at a time from the string
			String oneLine = br.readLine();
			// Keeps reading all lines until its equal to null
			while (oneLine != null) {
				System.out.println(oneLine);

				// Takes in the Spanish word and translates it to English
				// Makes all the words into separate strings using ("\\s+").
				String[] words = oneLine.split("\\s+");
				// System.out.println("*" + words[0] + "*");
				String englishTranslation = "";
				for (int i = 1; i < words.length; i++)
					englishTranslation += words[i] + " ";

				myTree1.insert(new Pair(words[0], englishTranslation));
				oneLine = br.readLine();

			}

			// In the case of an error it will be caught here
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// Implements a max heap called pair
		AVLTree<Pair> myTree1 = new AVLTree<Pair>();
		// initialised as null to begin with
		BufferedReader br = null;
		// Just in case of an error it will catch it
		try {
			// Reads whatever is in the SpanishWords.txt file to the console
			// window
			br = new BufferedReader(new FileReader("SpanishWords.txt"));
			// reads one line of text at a time from the string
			String oneLine = br.readLine();
			// Keeps reading all lines until its equal to null
			while (oneLine != null) {
				System.out.println(oneLine);

				// Takes in the Spanish word and translates it to English
				// Makes all the words into separate strings using ("\\s+").
				String[] words = oneLine.split("\\s+");
				// System.out.println("*" + words[0] + "*");
				String englishTranslation = "";
				for (int i = 1; i < words.length; i++)
					englishTranslation += words[i] + " ";

				myTree1.insert(new Pair(words[0], englishTranslation));
				oneLine = br.readLine();

			}

			// In the case of an error it will be caught here
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			System.out.println("==========================================");

			System.out.println("Enter the new Spanish Word you wish to use:");
			String spanish = sc.nextLine();

			System.out
					.println("Enter the new English translation of the Spanish Word:");
			String english = sc.nextLine();

			myTree1.insert(new Pair(spanish, english));

			System.out.println("-------------");
			System.out.println("Enter a Spanish word to search for");

			String spanish2 = sc.nextLine();

			Pair found = myTree1.search(new Pair(spanish2, null));
			if (found == null) {
				System.out.println("Could not find the word!!!");
			} else {
				System.out.println("spanish:" + found.getSpanishWord());
				System.out.println("english:" + found.getEnglishTranslation());

			}
			// Calls the printTree method
			myTree1.PrintTree();
		}
	}
}
