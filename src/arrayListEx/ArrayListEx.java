package arrayListEx;
import java.util.*;
public class ArrayListEx {

	
	    public static void main(String[] args)
	    {
	        
	        ArrayList A1 = new ArrayList();
	 
	 
	        A1.add(10);
	        A1.add("saurabh");
	 
	        A1.add(1,32);
	                    
	 
	        System.out.println(A1.size());    
	        System.out.println(A1);
	 
	        A1.remove(0);
	 
	        System.out.println(A1.size());    
	        System.out.println(A1);

	        System.out.println(A1.get(1));
	        
	        A1.set(1,20);
	        System.out.println(A1);
	    }
	}
