package Classesandobject;

import java.util.*;

public class Employee {
private int id;
private String name;
private int salary;

public void setemployee(int i,String n)
{
	this.id=i;
	this.name=n;
}
	
public void getemployee()
{
	System.out.println("Employee id"+this.id);
	System.out.println("Employee name"+this.name);
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
Employee e= new Employee();
e.setemployee(2020, "akshay");
e.getemployee();

}
}
