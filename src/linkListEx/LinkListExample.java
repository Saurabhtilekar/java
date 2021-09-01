package linkListEx;
import java.util.*;

public class LinkListExample {

	
	    public static void main(String[] args)
	    {
	        LinkedList list = new LinkedList();
	
	 
	        list.add("JAVA");
	 
	        list.add("J2EE");
	 
	        list.add("JSP");
	 
	        list.add("SERVLETS");
	 
	        list.add("JDBC");
	 
	     
	 
	        System.out.println(list);      
	        
	        String s = "JSP";
	 
	       
	 
	        boolean contains = list.contains(s);
	 
	        if(contains)
	        {
	          
	            System.out.println(list.indexOf(s)); 
	        }
	 
	        s = "STRUTS";
	 
	       
	 
	        contains = list.contains("JAVA");
	 
	        if(contains)
	        {
	            //If list contains "STRUTS", printing it's index
	 
	            System.out.println(list.indexOf("JAVA"));
	            
	        }
	    }
	}