package lulu;

import java.util.*;

public class FirstNonRepeated {
	
	public static void main(String[] args) {
		
		String x ="SILLYSPIDERS";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<x.length();i++)
		{
			if(map.containsKey(x.charAt(i))==false) {
				map.put(x.charAt(i), 1);
			}
			else {
				int oldval = map.get(x.charAt(i));
				map.put(x.charAt(i),oldval+1);
			}
		}
		Set<Map.Entry<Character,Integer>> lhmap = map.entrySet();
		
		for(Map.Entry<Character,Integer> data : lhmap) {
			if(data.getValue()==1) {
			System.out.println(data.getKey());
			System.exit(0);
			}
		}
	}
	
	

}
