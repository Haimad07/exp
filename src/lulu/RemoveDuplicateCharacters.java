package lulu;
import java.util.*;
public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) {
		
		String x ="sillyspiders";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<x.length();i++) {
			if(map.containsKey(x.charAt(i))==false) {
				map.put(x.charAt(i),1);
			}
			else {
			int	oldval = map.get(x.charAt(i));
			    map.put(x.charAt(i),oldval+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> lhmap =map.entrySet();
		String res = "";
		for(Map.Entry<Character,Integer> data:lhmap) {
			
	    res = res+data.getKey();
			
		}
		System.out.println(res);
	}

}
	
