import java.util.*;
public class Max3 {


	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter three nos");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a+"is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+" is grseter");
			
		}
		else
			System.out.println(c+"is greater");
		
	}

}
