//Write a java program to check given number is perfect number or not
package anudip.ANPD0453;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a number to check if it is a perfect number: ");
        int num = sc.nextInt();

        // Variable to store the sum of divisors
        int sumOfDiv = 0;

        // Find the divisors of the number
        for (int i = 1; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            { // Check if 'i' is a divisor
                sumOfDiv += i;
            }
        }

        // Check if the sum of divisors equals the number
        if (sumOfDiv == num && num > 0) 
        {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        // Close the scanner
        sc.close();

	}

}


/*Output:
Enter a number to check if it is a perfect number: 
28
28 is a perfect number.

Enter a number to check if it is a perfect number: 
18
18 is not a perfect number.
*/