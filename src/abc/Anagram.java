 package abc;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) 
	{
		String x = "brainy";
		String y = "binary";
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b)) {
			System.out.println("It is a anagram");
		}
		else {
			System.out.println("it is not a anagram");
		}
	}

}
