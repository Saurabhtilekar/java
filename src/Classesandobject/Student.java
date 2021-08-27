package Classesandobject;

public class Student {
	private int rollno;
	protected int admissionno;
	int age;
	public int courseid;
	
	private void doprivate()
	{
		System.out.println("in private  dopublic method");
		
	}
	 void dodefault()
	{
		System.out.println("in   dodefault method");
	}
	protected void doprotected()
	{
		System.out.println("in   doprotected method");
	}

	

}
