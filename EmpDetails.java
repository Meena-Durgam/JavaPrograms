//WAP to take emp id, name, address and salary from user and display on the screen

package anudip.ANPD0453;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //Create Scanner obj for input
		
		//Take emp details from user
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Address: ");
		String add = sc.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		Double sal = sc.nextDouble();
		
		
		//Display the emp details
		System.out.println("\n------------------------------");
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Address: " + add);
		System.out.println("Employee Salary: " + sal);
	}

}



/*
Enter Employee ID: 
101
Enter Employee Name: 
Meena Durgam
Enter Employee Address: 
Bhavani Peth, Solapur
Enter Employee Salary: 
20,000

------------------------------
Employee ID: 101
Employee Name: Meena Durgam
Employee Address: Bhavani Peth, Solapur
Employee Salary: 20000.0
*/
