package arrayEx;

public class Uniquepair {

	public static void main(String[] args) {
		int []array={2,4,3,5,6,-2,4,7,8,9};

for(int j=0;j<10;j++)
{

	for(int i=j+1;i<10;i++)
	{
		if(array[j]+array[i]==7)
			System.out.println("("+array[j]+","+array[i]+")");
					
	}
}

	}

}
