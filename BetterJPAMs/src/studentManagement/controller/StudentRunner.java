package studentManagement.controller;

import studentManagement.model.*;

public class StudentRunner 
{
	public static void main(String[] args)
	{
		Student myStudent = new Student(true, 9, "S12340000", "John Doe", "Male", 14, 3.85);
		System.out.println(myStudent);
	}
}
