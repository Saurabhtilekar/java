package com.demo;

import java.util.Scanner;

 class Money 
{
	private long dollars;
	private long cents;
	
	public void set(long newDollars)
	{
		if(newDollars<0)
		{
			System.out.println("Error negative amouint of money are not allowed.");
			System.exit(0);
		}
		else
		{
			dollars=newDollars;
			cents=0;
			
		}
	}
	
	public void set(double newAmount)
	{
		if(newAmount<0)
		{
			System.out.println("Error negative amouint of money are not allowed.");
			System.exit(0);
		}
		else
		{
			long allCents=Math.round(newAmount*100);
			dollars=allCents/100;
			cents=allCents%100;
			
			
			
		}
	}
	public void set(Money moneyObject)
	{
		this.dollars=moneyObject.dollars;
		this.cents=moneyObject.cents;
		
	}
	public void set(String amountString)
	{
		String dollarsString;
		String centsString;
		if(amountString.charAt(0)=='$');
		amountString=amountString.substring(1);
		amountString=amountString.trim();
		
		int pointLocation=amountString.indexOf(".");
		
		if(pointLocation<0)
		{
			cents=0;
			dollars=Long.parseLong(amountString);
			
		}
		else
		{
			dollarsString=amountString.substring(0,pointLocation);
			centsString =amountString.substring(pointLocation + 1);
					
					if (centsString.length() <= 1)
					centsString = centsString + "0";
					 
					dollars = Long.parseLong(dollarsString);
					cents = Long.parseLong(centsString);
					if ((dollars < 0) || (cents < 0) || (cents > 99))
					{
					System.out.println("Error: Illegal representation of money.");
					System.exit(0);
					}	
		}
			
	}
	public void readInput()
	{
	 System.out.println("Enter amount on a line by itself:");
	 Scanner keyboard = new Scanner(System.in);
	 String amount = keyboard.nextLine();
	set(amount.trim());
	}
	
	public void writeOutput()
	{
	 System.out.print("$" + dollars);
	if (cents < 10)
	 System.out.print(".0" + cents);
	else
	 System.out.print("." + cents);
	}
	/**
	Returns n times the calling object.
	*/
	public Money times(int n)
	{
	Money product = new Money();
	 product.cents = n * cents;
	long carryDollars = product.cents / 100;
	 product.cents = product.cents % 100;
	 product.dollars = n * dollars + carryDollars;
	return product;
	}
	
	public Money add(Money otherAmount)
	{
	Money sum = new Money();
	 sum.cents = this.cents + otherAmount.cents;
	long carryDollars = sum.cents / 100;
	 sum.cents = sum.cents % 100;
	 sum.dollars = this.dollars
	 + otherAmount.dollars + carryDollars;
	return sum;
	}
	

}
 public class MoneyDemo
{
public static void main(String[] args)
 {
 Money start = new Money();
 Money goal = new Money();
 System.out.println("Enter your current savings:");
 start.readInput();
 
 goal = start.times(2);
 System.out.print("If you double that, you will have ");
 goal.writeOutput();
 System.out.println(", or better yet:");
 goal = start.add(goal);
 System.out.println("If you triple that original amount, you will have:");
 goal.writeOutput();
 System.out.println();
 System.out.println("Remember: A penny saved");
 System.out.println("is a penny earned.");
 }
}

