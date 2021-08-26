import java.util.*;
public class Vowel {

	public static void main(String[] args) {
	char c;
	System.out.println("enter one character");
	Scanner sc=new Scanner(System.in);
	c=sc.next().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println("character is vowel");
	}
	else
	{
		System.out.println("character is consonant");
	}
	}

}
