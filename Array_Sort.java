/*Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20] */

package anudip.ANPD0453;

public class Array_Sort 
{
	
	public static void main(String[] args) 
	{
		// Initialize the array
        int[] num = {45, 35, 56, 67, 78, 89, 78, 12, 20};

        // Implement bubble sort to sort the array in ascending order
        for (int i = 0; i < num.length - 1; i++) 
        {
            for (int j = 0; j < num.length - 1 - i; j++) 
            {
                if (num[j] > num[j + 1]) 
                {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int number : num) 
        {
            System.out.print(number + " ");
        }
	}
}

/*Output
 * Sorted Array in Ascending Order:
 * 12 20 35 45 56 67 78 78 89 
*/
