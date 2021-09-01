package StringEx;
import java.util.*;


public class FirstOccurrence {

	public static void main(String[] args)
	 {
    String str;
    char ch;
    int i=0;
    int flag=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    System.out.println("Enter the character to find occurrence");
    ch=sc.next().charAt(0);
    
    while(i<str.length())
    {
    	if(str.charAt(i)==ch)
    	{
    		flag++;
    		break;
    		
    	}
    	i++;
    }
    if(flag==0)
    {
    	 System.out.println("We havent fount the character");
    }
    else
    {
    	 System.out.println("The first Character Occurance of "+ch+" position "+flag);
    }
    
    
	}

}
