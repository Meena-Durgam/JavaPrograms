/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
 * Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". 
 * Create an object of the Car class and call both the "drive" and "honk" methods.*/

package anudip.ANPD0453;


class Vehicle    //Parent Class
{
	String brand;
	String model;
	int year;

	// Method drive
	void drive() 
	{
		System.out.println("Driving");
	}
}

class Car extends Vehicle //Child Class
{
	String color;

	// Method honk
	void honk() 
	{
		System.out.println("Car is honking");
	}
}
public class Inheritance_T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		Car obj = new Car();
		obj.brand = "Toyota";
		obj.model = "ABC";
		obj.year = 2023;
		obj.color = "red";

		// Call the methods
		obj.drive();
		obj.honk();
	}

}
