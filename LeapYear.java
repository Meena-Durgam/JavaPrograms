//WAP to check leap year using if else. How to check whether a given year is a leap or not

package anudip.ANPD0453;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take the year input from the user
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        {
            System.out.println(year + " is a leap year.");
        } 
        else 
        {
            System.out.println(year + " is not a leap year.");
        }

	}

}

/* output
Enter a year: 
2025
2025 is not a leap year.
*/
