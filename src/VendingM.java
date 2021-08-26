import java.util.*;
public class VendingM {


	public static void main(String[] args) {
		
		int a,b;
		System.out.println("enter one amount");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		if(a>=2000)
		{
			b=a/2000;
			
			System.out.println("2000 *"+b+"=="+2000*b);
			a=a%2000;
		}
		if(a>=500)
		{
			b=a/500;
			
			System.out.println("500 *"+b+"=="+500*b);
			a=a%500;
		}
		if(a>=100)
		{
			b=a/100;
			
			System.out.println("100 *"+b+"=="+100*b);
			a=a%100;
		}
		if(a>=50)
		{
			b=a/50;
			
			System.out.println("50 *"+b+"=="+50*b);
			a=a%50;
		}
		if(a>=20)
		{
			b=a/20;
			
			System.out.println("20 *"+b+"=="+20*b);
			a=a%20;
		}
		if(a>=10)
		{
			b=a/10;
			
			System.out.println("10 *"+b+"=="+10*b);
			a=a%10;
		}
		if(a>=5)
		{
			b=a/5;
			
			System.out.println("5 *"+b+"=="+5*b);
			a=a%5;
		}
		if(a>=1)
		{
			b=a/1;
			
			System.out.println("1 *"+b+"=="+1*b);
			a=a%1;
		}
	}

}
