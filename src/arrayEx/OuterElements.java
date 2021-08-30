package arrayEx;
import java.util.*;
public class OuterElements {
	
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[][]=new int[4][4];
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.println("Enter the valur for Array["+i+"]["+j+"]");
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<4;i++)
	{
		
		for(int j=0;j<4;j++)
		{
			if(i==0||j==0||i==3||j==3)
			System.out.print(arr[i][j]+" ");
			else
				System.out.print("  ");
			
		}
		System.out.println("\n");
	}



	}}
