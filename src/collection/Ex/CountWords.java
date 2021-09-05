package collection.Ex;

import java.util.HashMap;

public class CountWords {
	
	public static void main(String[] args) {
		
		String str="Hii i am saurabh i am saurabh hii  hii hii";
		
		String[] arr=str.split(" ");
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int wordCount=map.get(arr[i]);
				//System.out.println(map.get(arr[i]));
				map.put(arr[i], wordCount+1);
			}
			else
				map.put(arr[i], 1);
			
			
		}
		
		
		System.out.println(map);
	}
	

}