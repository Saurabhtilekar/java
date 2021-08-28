package Loopprograms;

public class Breakex {

	public static void main(String[] args) {
		int n1=4,n2=5,n3=n1+n2;
		boolean t=true;
		
		System.out.println(n1+""+n2);
		while(t)
		{
			n3=n1+n2;
			if(n3>40)
				break;
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
			
		}
	}

}
