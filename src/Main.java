/**
 * @author Gavin Fennelly
 * @version 1 Created: 01/005/2016
 * @Last edited: 10/05/2016
 */
public class Main {

	public static void main(String[] args) {
		AVLTree<Integer> tree = new AVLTree<Integer>();
		for (int i = 1; i <= 7; i++)
			tree.insert(new Integer(i));

		tree.PrintTree();
	}

}
