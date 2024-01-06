package lulu;
import java.util.Scanner;
import java.util.*;

public class Practice1 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String");
	
	String x =sc.next();
	
	Map <Character,Integer> map = new HashMap<>();
	
	for(int i=0;i<x.length();i++)
	{
		if(map.containsKey(x.charAt(i))==false) {
			
			map.put(x.charAt(i), 1);
		}
		else {
			  int oldval= map.get(x.charAt(i));
			  int newval= oldval+1;
			  map.put(x.charAt(i), newval);
		}
	}
	
	Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
	char maxChar =' ';
	int  maxValue = 0;
	
	for(Map.Entry<Character,Integer> data:hmap) {
		
		if(data.getValue()>maxValue){
			maxValue = data.getValue();
			maxChar = data.getKey();
		}
		
		
	}
	System.out.print(maxChar);
	System.out.println(maxValue);
	
	
	
	}	
}
