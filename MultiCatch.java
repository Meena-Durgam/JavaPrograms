//Write a program demonstrating multiple catch statements and finally block.

package anudip.ANPD0453;

public class MultiCatch 
{

	    public static void main(String[] args) 
	    {
	        try 
	        {
	            int[] num = {10, 20, 30};
	            int nume = 10;
	            int den= 0;
	            
	         // ArithmeticException (division by zero)
	            int result = nume / den;
	            System.out.println("Result: " + result);
	            
	            //ArrayIndexOutOfBoundsException (invalid index)
	            System.out.println("Array element: " + num[5]);
	            
	        } catch (ArithmeticException e) 
	        {
	            // Handling division by zero error
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handling array index out of bounds error
	            System.out.println("Error: Array index is out of bounds.");
	        } catch (Exception e) {
	            // Handling any other unexpected exceptions
	            System.out.println("Error: Some other exception occurred.");
	        } finally {
	            // This block runs no matter what
	            System.out.println("Execution completed.");
	        }
	    }
}

/*output
 * Error: Division by zero is not allowed.
 * Execution completed.
 *
*/


