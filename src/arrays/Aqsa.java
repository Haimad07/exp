package arrays;
import java.util.*;
public class Aqsa {

	public static void main(String[] args) {
		
		String y = "abbbbcbbc";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<y.length();i++) {
			
		if(map.containsKey(y.charAt(i))==false) {
				map.put(y.charAt(i),1);
			}
			else {
				int oldval = map.get(y.charAt(i));
				int newval = oldval+1;
				    map.put(y.charAt(i),newval);    
			}	
		}
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		char charval=' ';
		int maxVal = 0;
		for(Map.Entry<Character,Integer> data : hmap) {
			if(data.getValue()>maxVal) {
				maxVal =data.getValue();
				charval =data.getKey();
			}
			
		}
		 System.out.print(charval+" ");
		 System.out.print(maxVal);
		
		
	}
}
