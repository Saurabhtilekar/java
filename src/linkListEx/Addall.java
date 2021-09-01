package linkListEx;

import java.util.LinkedList;

public class Addall {
	public static void main(String[] args)
	{
		 LinkedList list = new LinkedList();
			
		 
	        list.add("JAVA");
	 
	        list.add("J2EE");
	 
	        list.add("JSP");
	 
	        list.add("SERVLETS");
	 
	        list.add("JDBC");
	 
	     
	 
	        System.out.println(list); 
	        LinkedList l2 = new LinkedList();
	    	
	   	 
	        l2.add("C");
	 
	        l2.add("C++");
	 
	        l2.add("PHYTHON");
	 
	        l2.add("JAVA");
	 
	        l2.add("HTML");
	 
	     
	 
	        System.out.println(l2);
	        list.addAll(l2);

	        System.out.println(list); 
	        
	}

}
