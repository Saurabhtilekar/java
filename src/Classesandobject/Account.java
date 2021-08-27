package Classesandobject;

public class Account {

	 String name;
	 int accno;
	 
	float amount;
	
	 void insert(int a,String n,float amt)
	{
		accno=a;
		name=n;
		amount=amt;
	}
	 
	 void withdraw(float amt)
	 {
		 if(amount<amt)
		 {
			 System.out.println("Low balance");
		 }
		 else
		 {
			amount=amount-amt;
			System.out.println(amt+"Withdrawal");

		 }
	 }
	 
	 void display()
	 {
		 System.out.println("Name:"+name);
		 System.out.println("Account No:"+accno);
		 System.out.println("Balane:"+amount);



	 }
	 void deposit(float amt)
	 {
		 amount=amount+amt;
	 }


public static void main(String[] args) {
	
Account a=new Account();
a.insert(2020, "Akshay", 2000);
a.display();
a.withdraw(1000);
a.display();
a.deposit(100);
a.display();
}}
