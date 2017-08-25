package basicInputOutput.controller;
import java.util.Scanner;

public class BasicIOController 
{
	private String firstName = "";
	private String lastName = "";
	
	/**
	 * Allows user to provide a name to be used in other methods
	 * @param first name
	 * @param last name
	 */
	public BasicIOController(String first, String last)
	{
		firstName = first; 
		lastName = last;
	}
	/**
	 *Prints a greeting
	 *
	 *@param void
	 *@return void
	 */
	public void printGreeting()
	{
		System.out.println("Hello " + firstName + " " + lastName);
		Scanner myScanner = new Scanner(System.in);
		String response = myScanner.nextLine();
		System.out.println(response);
		myScanner.close();
		
	}
}
