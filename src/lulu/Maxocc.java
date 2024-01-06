package lulu;
import java.util.*;
import java.util.Scanner;
// 1. create string with varaiable x.
//2.create a hashmap table and iterate over each character and each key put into the
//map 
//intialise  maxval to -1 and maxchar to ' ' .
//by using for each loop and giving condition we get max char key.
//print the max repeated word.

public class Maxocc {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		
		String x =sc.next();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<x.length();i++) {
			if(map.containsKey(x.charAt(i))==false) {
				
				map.put(x.charAt(i), 1);
				
			}
			else {
				int oldval = map.get(x.charAt(i));
				map.put(x.charAt(i), oldval+1);
			}
		}
			Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
			
			int maxVal = -1;
			char maxChar = ' ';
			for(Map.Entry<Character,Integer> data : hmap) {
			if(data.getValue()>maxVal) {
				
				maxVal = data.getValue();
				maxChar = data.getKey();
				
			}
			}
			System.out.print(maxChar+" "+maxVal);
		}
	}


