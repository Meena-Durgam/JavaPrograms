//WAP to find the perimeter of square

package anudip.ANPD0453;

import java.util.Scanner;

public class PerSquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //create scanner object for input data from user
		
		//take side length input from user
		System.out.println("Enter side length of Square: ");
		double side=sc.nextDouble();
		
		//Calculate perimeter 
		double per= 4 * side;
		
		//Display perimeter of Square
		System.out.println("The Perimeter of Square is:\n" +per);

	}

}


/* Output:
Enter side length of Square: 
32
The Perimeter of Square is:
128.0
*/