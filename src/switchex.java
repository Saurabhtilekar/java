import java.util.*;
public class switchex {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
System.out.println("enter to numbers");
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
switch(a/b)
{
case 1:
	System.out.println(a+"is greater than"+b);
	break;
	default:
		System.out.println(b+"is greater than"+a);
}
	}

}
