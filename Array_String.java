//Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]. 

package anudip.ANPD0453;

import java.util.Arrays;// Importing the Arrays class for sorting

public class Array_String
{

	public static void main(String[] args) 
	{
		// Declare and initialize the array with given strings
		String[] str = {"A", "X", "D", "Z", "Y", "C", "W", "B"}; 
		
		// Sort and print in descending order
		Arrays.sort(str);
		System.out.println("Sorted String is: ");
		for (int i = str.length - 1; i >= 0; i--) 
		{
			
			System.out.print(str[i] + " ");
		}

	}

}

/*Output:
 * Sorted String is: 
 * Z Y X W D C B A 
 *
*/