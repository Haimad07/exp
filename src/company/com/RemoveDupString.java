package company.com;

import java.util.*;

public class RemoveDupString {
	
	public static void main(String[] args) {
		
		String str ="abbccd";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))==false) {
				  
				map.put(str.charAt(i),1);
				
			}
			else {
				int oldval = map.get(str.charAt(i));
				map.put(str.charAt(i),oldval+1);
			}
		}
		Set<Map.Entry<Character,Integer>> lhmap = map.entrySet();
		String res = "";
		for(Map.Entry<Character, Integer> data:lhmap) {
			res = res+data.getKey();
			
			}
		System.out.println(res);
		
		}
		
		
	}


