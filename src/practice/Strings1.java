package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Strings1 {

	public static void main(String[] args) {
		
	        String x ="abbccd";
	        
	        Map<Character,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<x.length();i++) {
	        	
	        	if(map.containsKey(x.charAt(i))==false){
	        		
	        		map.put(x.charAt(i),1);
	        		
	        	}
	        	else {
	        		int oldval = map.get(x.charAt(i));
	        		map.put(x.charAt(i),oldval+1);
	        	}
	        	
	        }
	        
	       Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
	       
	       for(Map.Entry<Character,Integer> data:hmap) {
	    	   
	    	   if(data.getValue()==1) {
	    		   System.out.print(data.getKey());
	    	   }
	    	   
	       }
	        
	        
	        }
}
