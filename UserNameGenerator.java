/**Student Name: First Last

*Date Completed:03/07/22

*Project No. and Page No. in the book: Chapter 3 PP

*Extra Credit: No

*Project Description: The program is collecting the users information to create a pseudorandom username with methods from the String class, Math class, and Random Class. 
**/

package username;

import java.util.*;
public class UserNameGenerator {
	
	public static void main (String[] args) {
	//declaring variables that will be used in the program	
	String firstName,lastName, lastNameGen, fullName, lowerName;
	double age, newAge, numGen;
	char firstNameGen;
	//creating objects that will be used in the program
	Scanner input = new Scanner(System.in);
	Random generator = new Random();
	
	System.out.println("What is your first name: ");
	firstName = input.nextLine();
	
	System.out.println("What is your last name? ");
	lastName = input.nextLine();
	
	System.out.println("What is your age: ");
	age = input.nextInt();
	
	/*using methods in the math class to get a calculated number 
	 * from the user's input age to later apply to the index of
	 *  the user's first name
	*/
	newAge = (Math.sqrt(age)/2);
	newAge = Math.floor(newAge);
	
	firstNameGen = firstName.charAt((int)newAge -1); //convert newAge to an int since math calculates in double
	
	lastNameGen = lastName.substring(lastName.length()-4); //uses the length and substring method to get the last 4 letters in the user's last name
	
	fullName = (firstNameGen + lastNameGen);// concatenates variables to create username's base
	
	lowerName = fullName.toLowerCase();
	
	numGen = generator.nextDouble(age,100); //use method in random class to assign random number starting from user's input age
	
	//Display's user's initial input and newly created username
	System.out.println();
	System.out.println("Your full name is: \t\t" + firstName + " " + lastName);
	System.out.println("Your age is: \t\t\t" + (int)age);
	System.out.println("Your user name is: \t\t" + lowerName + (int)numGen);
	
    
	
	
	}
}
