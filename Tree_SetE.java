/* Write a program using TreeSet insert Integer values and print them. */

package anudip.ANPD0453;

import java.util.TreeSet;

public class Tree_SetE 
{
	public static void main(String[] args) 
	{
			// Creating a TreeSet to store Integer values
			TreeSet<Integer> t = new TreeSet<Integer>();
			
			// Adding integer values to the TreeSet
			t.add(20);
			t.add(30);
			t.add(45);
			t.add(56);
			t.add(70);
			t.add(80);
			
			// Printing the TreeSet (sorted order)
			System.out.println("Treeset Elements : "+t);

		}

	}


/*Output:
 * Treeset Elements : [20, 30, 45, 56, 70, 80]
*/


