
import java.util.Scanner;
public class Weekdays{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
System.out.println("enter to numbers");
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();

switch(a)
{
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
	default:
		System.out.println("Error dat does not exist");
}
	}

}

