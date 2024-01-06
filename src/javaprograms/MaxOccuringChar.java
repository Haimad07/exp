package javaprograms;
/*
 * 1.Create a String with reference x.
 * 2.Create a empty HashMap to store key-value pairs.
 * 3.Iterate over each character and place it in a map and initialize  i=0,
 * 4.initialize maxValue as -1 and maxChar as ' ' .*/

import java.util.*;

public class MaxOccuringChar {
	
	public static void main(String[] args) {
		
		String x ="abbccc";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<x.length();i++) {
			
			if(map.containsKey(x.charAt(i))==false) {
				
				map.put(x.charAt(i),1);
			}
			else {
				int oldval = map.get(x.charAt(i));
				  map.put(x.charAt(i), oldval+1);
			}
		}
			Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
			
			 int maxVal = -1;
			 char maxChar = ' ';
			 
			 for(Map.Entry<Character,Integer> data: hmap) {
				 
				 if(data.getValue()>maxVal) {
					  maxVal = data.getValue();
					  maxChar = data.getKey();
				 }
			 }
			 
			 System.out.println(maxChar+" "+maxVal);
			
			
			
		}
		
	}


