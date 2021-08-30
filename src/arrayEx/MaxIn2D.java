package arrayEx;


import java.util.*;

public class MaxIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]={{22,31,9},{12,25,16}};

for(int i=0;i<3;i++)
{
	int max=0;
	for(int j=0;j<3;j++)
	{
		if(arr[i][j]>max)
		{
			max=arr[i][j];
		}
	}
	System.out.println(max);
	
}



}}
