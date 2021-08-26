import java.util.Scanner;

 
public class salary {

	public static void main(String[] args) {
		int s,hra,da;
		System.out.println("enter the salary");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		if(s<10000)
		{
			hra=(s*20)/100;
			da=(s*80)/100;
			
			System.out.println("Gross salary of employee"+(s+hra+da));
		}
		else if(s<20000)
		{
			hra=(s*50)/100;
			da=(s*90)/100;
			
			System.out.println("Gross salary of employee"+(s+hra+da));
		}
		else
		{
			hra=(s*30)/100;
			da=(s*95)/100;
			
			System.out.println("Gross salary of employee"+(s+hra+da));
		}
	}

}
