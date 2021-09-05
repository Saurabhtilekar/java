package collection.Ex;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
	
   HashSet s1 =new HashSet();
   s1.add(1);
   s1.add(3);
   s1.add(4);
   s1.add(5);
   s1.add(3);
   printSet(s1);
   System.out.println(s1);
   System.out.println(s1.size());
   
   
	}
	public static void printSet(HashSet s1)
	{
		System.out.println("The set contins");
		for(Object obj :s1.toArray())
		{
			Integer num=(Integer)obj;
			System.out.println(num.intValue());
		}
	}

}
