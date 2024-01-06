package arrays;

import java.util.Scanner;
import java.util.*;

public class ReaptedCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		 
		String x =sc.nextLine();
		
		Map<Character,Integer> map = new HashMap<>();
		
		 int i=0;
		 while(i!=x.length()) {
			 if(map.containsKey(x.charAt(i))==false) {
				 map.put(x.charAt(i),1);
			 }
			 else
			 {
				 int oldval = map.get(x.charAt(i));
				 int newval = oldval+1;
				 map.put(x.charAt(i), newval);
			 }i++;
		 }
		 
		 Set<Map.Entry<Character, Integer>> hmap =  map.entrySet();
		 
		 char MaxChar = ' ';
		 int  MaxVal = -1;
		
		 for (Map.Entry<Character,Integer> data: hmap) {
			 
			 if(data.getValue()>MaxVal) {
				 
				 MaxVal = data.getValue();
				 MaxChar = data.getKey();
			 } 
		 }
		 
		 System.out.print(MaxChar);
		 System.out.println(MaxVal);
		 
		
	}
	}

