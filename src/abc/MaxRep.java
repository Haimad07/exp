package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxRep {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		MaxRepeatedChar(str);
		
		
	}
	 
	private static char MaxRepeatedChar(String str) {
		
		Map<Character,Integer> map =  new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))==false) {
				map.put(str.charAt(i),1);
			}
			
			else {
				int oldval = map.get(str.charAt(i));
				
				map.put(str.charAt(i),oldval+1);
			}
		  }
		Set<Map.Entry<Character,Integer>>hmap = map.entrySet();
		
		int maxVal = -1;
		char maxChar = ' ';
		      
		for(Map.Entry<Character,Integer> data:hmap) {
			if(data.getValue()>maxVal) {
				maxVal = data.getValue();
				maxChar = data.getKey();
			}
		}
		System.out.println(maxChar+" "+maxVal);
		
		return maxChar;
		
	}

}
