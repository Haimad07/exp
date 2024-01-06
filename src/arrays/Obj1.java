package arrays;

import java.util.*;

public class Obj1 {
	public static void main(String[] args) {
		String x ="abbccc";
		Map<Character,Integer> map = new HashMap<>();
		 int i=0;
		while(i!=x.length()) {
		   if (map.containsKey(x.charAt(i))==false) {
			   map.put(x.charAt(i), 1);
		   }
		   else {
			   int oldval =  map.get(x.charAt(i));
			   int newval = oldval +1;
			    map.put(x.charAt(i),newval);
		   }
		i++;
		}
		Set<Map.Entry<Character, Integer>> hmap=  map.entrySet();
           for(Map.Entry<Character,Integer> data : hmap) {                      
                          System.out.print(data.getKey());
                          System.out.println(data.getValue());
                          
           }
		
	}

}
