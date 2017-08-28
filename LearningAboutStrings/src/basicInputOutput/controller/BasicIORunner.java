package basicInputOutput.controller;

public class BasicIORunner 
{

	public static void main(String[] args) 
	{
		BasicIOController myGreeting = new BasicIOController("John", "Doe");
		System.out.println(myGreeting);
		myGreeting.printGreeting();
	}

}
