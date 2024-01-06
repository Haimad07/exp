package lulu;

import java.util.*;

public class DeleteDuplicateCharacter {
	
	public static void main(String[] args) {
		String x = "sillyspiders";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i= 0;i<x.length();i++) {
			if(map.containsKey(x.charAt(i))==false) {
				map.put(x.charAt(i),1);
			}
			else 
			{
			   int oldval = map.get(x.charAt(i));
			   map.put(x.charAt(i), oldval+1);
			   }
			
		}
 Set< Map.Entry<Character,Integer>>hmap = map.entrySet();
 
   String res="";
  for(Map.Entry<Character,Integer>data:hmap) {
	  res = res+data.getKey();
  }
  System.out.println(res);
		
  }	
   }
  
 



