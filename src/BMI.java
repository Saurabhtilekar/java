import java.util.*;
public class BMI {

	public static void main(String[] args) {
		double height,weight,bmi;
		System.out.println("enter the weight in Kg");
		Scanner sc=new Scanner(System.in);
		weight=sc.nextDouble();
		System.out.println("enter the height in meter");
		height=sc.nextDouble();
		bmi=weight/(height*height);
		System.out.println("Body mass index is  "+bmi);
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi>=18.5&&bmi<25)
		{
			System.out.println("Normal");
		}
		else if(bmi>=25&&bmi<30)
		{
			System.out.println("Overweight");
		}
		else if(bmi>30)
		{
			System.out.println("Obese");
		}

	}

}
