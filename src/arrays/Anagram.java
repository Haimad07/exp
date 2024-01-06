package arrays;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String a ="brainy";
		String b= "binary";
		
		char x[]=a.toCharArray();
		char y[]=b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		if(Arrays.equals(x,y)) {
			System.out.println("it is a anagram");
		}
		
	}

}
