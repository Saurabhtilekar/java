package collection.Ex;

import java.util.*;

public class SortedSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SortedSet s1 =new TreeSet();
		 
		 
		   s1.add(1);
		   s1.add(3);
		   s1.add(4);
		   s1.add(5);
		   s1.add(3);
		   s1.add(2);
		   s1.add(7);
		   s1.add(8);
		  // printSet(s1);
		   System.out.println(s1);
		   
		   System.out.println(s1.size());
		   
		   s1.remove(5);
		   System.out.println("After removing 5");
		   System.out.println(s1);
		   
		   System.out.println(s1.headSet(4));
		   System.out.println(s1.tailSet(4));
		   System.out.println(s1.subSet(4,8));
			}
	}


