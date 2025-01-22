//Write a program to check given number is prime number or not
package anudip.ANPD0453;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();

        // Initialize a flag variable
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (num <= 1) {
            isPrime = false; 
        } else {
            // Loop to check divisors from 2 to number / 2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break; 
                }
            }
        }

        // Print the result based on the flag value
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Close the scanner
        sc.close();
	}

}


/*Output
Enter a number to check if it is prime: 
28
28 is not a prime number.

Enter a number to check if it is prime: 
23
23 is a prime number.
*/