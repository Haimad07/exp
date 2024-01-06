package lulu;

import java.util.*;

public class Practice9 {

	public static void main(String[] args) {
		String x = "Shabbir";
		
		Map<Character,Integer> map = new HashMap<>();
		
		int i=0;
		while (i!=x.length()) {
			if(map.containsKey(x.charAt(i))==false) {
				map.put(x.charAt(i), 1);
			}
			else {
				int oldval = map.get(x.charAt(i));
				map.put(x.charAt(i), oldval+1);
			}i++;
			
		}
		
		Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		int maxValue=0;
		char maxChar = ' ';
		
	for(Map.Entry<Character,Integer>data : hmap) {
	
	if(data.getValue()>maxValue) {
		maxValue = data.getValue();
		maxChar=data.getKey();
	}
	}
		System.out.print(maxChar);
		System.out.println(maxValue);
	}

}
