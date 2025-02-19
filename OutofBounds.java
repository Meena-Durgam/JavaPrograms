//Write a program using exception handling to handle array index out of bounds.
package anudip.ANPD0453;

public class OutofBounds 
{

	public static void main(String[] args) 
	{
        int[] arr = {10, 20, 30};
        
        try {
            // Attempting to access an index that is out of bounds
            System.out.println("Element at index 4: " + arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print a message
            System.out.println("Error: Index out of bounds!");
            
        }
        System.out.println("Program will continue");
    }

}

/*output
 * Error: Index out of bounds!
 * Program will continue
*/


