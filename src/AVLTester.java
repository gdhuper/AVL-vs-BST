
import java.util.Random;

public class AVLTester {

	public static void main(String[] args)

	{

		AVLTree<Integer> b = new AVLTree<Integer>(); // Creating a new AVL tree.
		int min = 10; // starting point for random integers 
		int max = 99; // ending point for random integers
		Random random = new Random();
		for (int i = 0; i <= 35; i++) // Printing the tree after each insertion
		{
			b.insert(random.nextInt(max - min) + min);
			TreePrinter o = new TreePrinter(b);
			o.print("AVL Insert. " + "Current Height: " + b.height());
		}
		System.out.println("==============================================================================================================");
		// To separate insert and remove processes 
		
		while (!b.isEmpty()) //Printing the tree after each deletion
			{ 
			if (b.height() != 0) {
				b.remove(b.getRoot().getData());
				TreePrinter o = new TreePrinter(b);
				o.print("AVL Remove. " + " Current Height: " + b.height());
			}

		}

	}
}