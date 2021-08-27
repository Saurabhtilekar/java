package Classesandobject;

public class Account1 {
public long accountno;
public String coustomername;

Account1()
{
	accountno=2020;
	coustomername="akshay";
	System.out.println("i am in default constructor ");
	
}
Account1(long acc,String name)
{
	this.accountno=acc;
	this.coustomername=name;
	System.out.println("Account no "+this.accountno);
	System.out.println("Account no "+this.coustomername);
	System.out.println("i am in parameterized constructor ");
	
}
	

public static void main(String[] args) {
	Account1 a=new Account1();
	Account1 a2=new Account1(2021,"saurabh");
}
}