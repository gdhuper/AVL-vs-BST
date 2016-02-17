
import java.util.Random;
public class BSTPrinter {
	
	public static void main(String[] args)
	{
		BinarySearchTree<Integer> b = new BinarySearchTree<Integer>(); // Constructs a new BST
		int min = 10;
		int max =  99;
		
		Random random = new Random();
		
		while(b.height() < 5) // keeps inserting the value until the height of the tree gets to 5
		{
			b.insert(random.nextInt(max - min) + min);
		}
		
		TreePrinter one = new TreePrinter(b); // Constructs a TreePrinter object with given node
		one.print("BST Insert. " + "Current Height: " + b.height() ); //Prints the tree
		
		System.out.println(); // Adds a line to separate the outputs
		
		while(b != null) // keeps deleting the elements of the tree until the tree is empty
		{
			
			if(b.height() == 0)
			{
				break;
			}
			b.remove(b.getRoot().getData());
			one = new TreePrinter(b);
			one.print("BST Remove. " + "Current Height: " +b.height());
			
			
		}
	}
}