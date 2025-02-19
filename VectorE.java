/* Write a program using Vector to store the list of students details and print the details. */

package anudip.ANPD0453;

import java.util.Vector;

public class VectorE {

	public static void main(String[] args) {
		// Creating a Vector to store student details
		Vector<String> vec = new Vector<String>();
		
		// Adding student details
		vec.add("Name : Meena , Age : 21 , Branch : Computer science");
		vec.add("Name : Nandini , Age : 22 , Branch : AI&DS ");
		vec.add("Name : Pooja , Age : 23 , Branch : EN&TC ");
		vec.add("Name : Vaishnavi , Age : 24 , Branch : Electrical ");
		vec.add("Name : Akhila , Age : 25 , Branch : Information Technology");
		
		// Printing student details
		System.out.println("Student Details: ");
		for(String students : vec) {
			System.out.println(students);
		}
	}

}

/*

Output:
Student Details: 
Name : Meena , Age : 21 , Branch : Computer science
Name : Nandini , Age : 22 , Branch : AI&DS 
Name : Pooja , Age : 23 , Branch : EN&TC 
Name : Vaishnavi , Age : 24 , Branch : Electrical 
Name : Akhila , Age : 25 , Branch : Information Technology

*/


