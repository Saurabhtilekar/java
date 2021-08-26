import java.util.*;
public class Divisibilitytest {

	
	public static void main(String[] args) {
		int a;
		System.out.println("enter the no");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		if(a%5==0&&a%11==0)
		{
			System.out.println(a+" is Divisible by 5and 11");
		}
		else if (a%11==0)
		{
			System.out.println(a+" is Divisible by 11");
		}
		else if (a%5==0)
		{
			System.out.println(a+" is Divisible by 5");
		}
	}

}
