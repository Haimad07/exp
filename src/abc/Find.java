package abc;

import java.util.*;
public class Find {
	
	public static void main(String[] args) {
		
		String str = "abbccc";
		
		HashMap<Character,Integer>map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))==false){
				  bb 
				map.put(str.charAt(i),1);
				
			}  
			else {
				 int oldval  =map.get(str.charAt(i));
				 int newval = oldval+1;
				 map.put(str.charAt(i),newval);
			}
		}
		
		Set<Map.Entry<Character,Integer>> hmap =map.entrySet();
		
		int maxVal = -1;
		char maxChar = ' ';
		
		for(Map.Entry<Character,Integer> data:hmap) {
			if(data.getValue()>maxVal) {
				maxVal=data.getValue();
				maxChar=data.getKey();
			}
		}
		System.out.println(maxVal);
		System.out.println(maxChar);
		
	}

}
