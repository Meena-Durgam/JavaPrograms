//Write java program to check  candidate eligible for voting or not

package anudip.ANPD0453;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take age input from the user
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        
    }
}


/*Output
Enter your age: 
20
You are eligible to vote.
*/