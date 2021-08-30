package arrayEx;

public class MinIn2D {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[][]={{22,31,9},{12,25,16},{34,42,2}};

	for(int i=0;i<3;i++)
	{
		int min=100;
		for(int j=0;j<3;j++)
		{
			if(arr[j][i]<min)
			{
				min=arr[j][i];
			}
		}
		System.out.println(min);
		
	}



	}}
