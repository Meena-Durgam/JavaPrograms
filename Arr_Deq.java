/* Write a program using ArrayDeque to add book names and add,delete the values from both ends of que. */

package anudip.ANPD0453;

import java.util.ArrayDeque;

public class Arr_Deq 
{
	public static void main(String[] args) 
	{
		
		// Creating an ArrayDeque to store book names
		ArrayDeque<String> a = new ArrayDeque<String>();
			
		// Adding books to the deque
		a.addFirst("The Alchemist");
		a.addLast("The Lord of the Rings");
		a.addFirst("Harry Potter");
		a.addLast("Rich Dad Poor Dad");

		// Printing the book list
		System.out.println("Books in the queue : "+a);
			
		// Removing books from both ends
		a.removeFirst();
		a.removeLast();
			
		// Printing the updated book list
		System.out.println("After removing from the both ends : "+a);

	}

}

/*Output:
Books in the queue : [The Alchemist,The Lord of the Rings, Harry Potter, Rich Dad Poor Dad ]
After removing from the both ends : [The Lord of the Rings, Harry Potter]
*/