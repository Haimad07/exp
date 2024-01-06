package lulu;
import java.util.*;

public class OccuringMaxChar {
	
	public static void main(String[] args) {
		
		String str = "abbcccdefgz12";
	
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))==false) {
				
				map.put(str.charAt(i),1);	
			}
			else {
				int oldval = map.get(str.charAt(i));
				map.put(str.charAt(i), oldval+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> hmap =map.entrySet();
	/*	char maxChar =' ';
		int maxVal = -1;*/
		String res="";
		for(Map.Entry<Character,Integer> data: hmap) {
			if(data.getValue()<=1) {
			/*maxVal =data.getValue();
				maxChar =data.getKey();*/	
				//res=res+data.getKey();
				System.out.print(data.getKey());
			}
			
		}
		
		/*System.out.print(maxChar);
		System.out.println(maxVal);*/
		//System.out.println(res);
	}

}
