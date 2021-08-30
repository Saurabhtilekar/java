
package arrayEx;
import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][4];
Scanner sc= new Scanner(System.in);
for(int i=0;i<3;i++)
{
	for(int j=0;j<4;j++)
	{
		System.out.println("Enter the valur for Array["+i+"]["+j+"]");
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0;i<3;i++)
{
	
	for(int j=0;j<4;j++)
	{
		System.out.print(arr[i][j]+" ");
		
	}
	System.out.println("\n");
}



}}
