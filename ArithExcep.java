//Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package anudip.ANPD0453;

public class ArithExcep {

	public static void main(String[] args) {
        try {
            int num = 10;
            int den = 0;
            
            // Attempting division, which may throw ArithmeticException
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero error
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

}

/*output
 * Error: Division by zero is not allowed.
 */
