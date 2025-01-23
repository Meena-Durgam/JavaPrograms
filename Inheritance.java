/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
 * Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". 
 * Create an object of the Student class and call both the "speak" and "study" methods.*/

package anudip.ANPD0453;

class Person   //Parent class
{
	String name;
	int age;
	
	// Method to speak
    void speak() 
    {
        System.out.println(name + " is speaking.");
    }
}

class Student extends Person 
{
	String grade;

	
	void study() // Method to study
	{
		System.out.println("grade " + grade );
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		
		obj.name = "Meena";
		obj.age = 21;
		obj.grade = "A";

		// Call the methods
		obj.speak();
		obj.study();

		
		
	}

}
/*Output:
Meena is speaking.
grade A
*/