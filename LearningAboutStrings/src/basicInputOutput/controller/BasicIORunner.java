package basicInputOutput.controller;

public class BasicIORunner 
{

	public static void main(String[] args) 
	{
		BasicIOController myGreeting = new BasicIOController("John", "Doe");
		myGreeting.printGreeting();
	}

}
