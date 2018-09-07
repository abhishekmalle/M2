<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> David

// Java program to ReverseString using StringBuilder 

package edu.gatech.oad.antlab.person;
import java.lang.*; 
import java.io.*; 
import java.util.*; 
<<<<<<< HEAD
=======
package edu.gatech.oad.antlab.person;
>>>>>>> 2adb4f0b89b42537a69c3cab648b1c95a140e0a1
=======
>>>>>>> David
/**
 *  A simple class for person 3
 *  returns their name and a
 *  reversed string 
 *  
 *  @author  Bob
 *  @version 1.1
 */
public class Person3 {
   /** Holds the persons real name */  
	private String name;
	
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person3(String pname){
	  name = pname;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
	
	/**
	 * This method should take the string
	 * input and return its reverse.
	 * given "gtg123b" it should return
	 * b321gtg.
	 *
	 * @param input the string to be reversed
	 * @return the reversed string
	 */
	private String calc(String input) {
	  //Person 3 put your implementation here
	  StringBuilder input1 = new StringBuilder();
	  input1.append(input);
	  input1 = input1.reverse();
	  return input1.toString();
	}
}
