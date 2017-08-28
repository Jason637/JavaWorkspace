package basicInputOutput.controller;
import java.util.Scanner;

public class BasicIOController 
{
	private String firstName = "";
	private String lastName = "";
	
	/**
	 * Allows user to provide a name to be used in other methods
	 * @param firstName First name
	 * @param lastName Last name
	 */
	public BasicIOController(String firstName , String lastName)
	{
		this.firstName = firstName; 
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName; 
	}
	/**
	 *Prints a greeting
	 *
	 *@param 
	 *@return 
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
