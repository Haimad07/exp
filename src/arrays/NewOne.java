package arrays;
import java.util.*;
public class NewOne {
		public static void main (String[] args) {
		      char maxChar = findMaxRepeatedChar("");
		System.out.println("The max repeated char: " + maxChar);
		}

		private static char findMaxRepeatedChar(String str) {
		Map<Character, Integer> map = new HashMap<>();

		// Identify the length of each char
		for(int i = 0; i  < str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))==false) {
				map.put(str.charAt(i),1);
			}
			else {
				  int oldval =map.get(str.charAt(i));
				  map.put(str.charAt(i),oldval+1);
			}
		}

		// Identify the max repeated char
		Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		  int maxValue = -1;
		 char maxChar = ' ';
		for(Map.Entry<Character,Integer> data : hmap) {
		if(data.getValue()>maxValue) {
		   maxChar = data.getKey();
		   maxValue = data.getValue();
		}
		}
		return maxChar;
		}
}



