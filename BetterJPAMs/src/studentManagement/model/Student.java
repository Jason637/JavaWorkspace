package studentManagement.model;

public class Student 
{
	boolean isCurrentStudent;
	int gradeLevel;
	String idNumber;
	String name;
	String gender;
	int age;
	double gpa;
	
	public Student()
	{
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = "S00000000";
		name = "";
		gender = "";
		age = 0;
		gpa = 0.0;		
	}
	/**Overloaded constructor
	 * 
	 * @param isCurrentStudent
	 * @param gradeLevel
	 * @param idNumber
	 * @param name
	 * @param gender
	 * @param age
	 * @param gpa
	 */
	public Student(boolean isCurrentStudent, int gradeLevel, String idNumber, String name, String gender, int age, double gpa)
	{
		this.isCurrentStudent = isCurrentStudent;
		this.gradeLevel = gradeLevel;
		this.idNumber = idNumber;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.gpa = gpa;
	}
	/**
	 * @return String description of class
	 */
	public String toString()
	{
		String str = "";
		if (isCurrentStudent)
		{
			str = "Student: " + name + " " + idNumber + " " + gender +" Age: " + age + "Grade: " + gradeLevel + " " + "GPA: " + gpa;
		}
		return str;
	}
	
}
