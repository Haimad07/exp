package practice;
import java.util.*;

public class MaxOccuringChar {
 public static void main(String[] args) {
	 
	 String x = "abbccc";
	 Map<Character,Integer> map = new HashMap<>();
	 
	 for(int i=0;i<x.length();i++) {
		 if(map.containsKey(x.charAt(i))==false) {
			 map.put(x.charAt(i),1);
			 }
		 else {
			 int oldval = map.get(x.charAt(i));
			 map.put(x.charAt(i),oldval+1);
		 }
	 }
		 
		 Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		 int maxVal=-1;
		 char maxChar=' ';
		 for(Map.Entry<Character,Integer> data:hmap) {
			 if(data.getKey()>maxVal) {
				 maxVal = data.getValue();
				 maxChar = data.getKey();
			 }
		 }
		 System.out.println(maxChar+" "+maxVal);
	 }
	 
	 
 }

