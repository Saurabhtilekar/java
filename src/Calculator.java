import java.util.*;
public class Calculator {

	
	public static void main(String[] args) {
		
int a,b;
char c ='+';
System.out.println("enter to numbers");
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();

b=Sc.nextInt();
switch(c)
{
case '+':
	System.out.println(a+b);
	break;
case '-':
	System.out.println(a-b);
	break;
case '/':
	System.out.println(a/b);
	break;
case '*':
	System.out.println(a*b);
	break;
	default:
		System.out.println("Invalid Expression");
}
	}

}
