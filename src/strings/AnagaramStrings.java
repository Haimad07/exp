package strings;

import java.util.Arrays;

public class AnagaramStrings {
	
	public static void main(String[] args) {
		
		String x="listen";
		String y="silent";
		
		char a[] = x.toCharArray();
		char b[]= y.toCharArray();
		
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    Boolean result = Arrays.equals(a, b);
	    if(result==true) {
	    	System.out.println("Strings are anagram");
	}
	    else
	    {
	    	System.out.println("Strings are not anagram");
	    }
	}
}
