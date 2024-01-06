package abc;

import java.util.*;

public class LongestSubString {
	
	public static void main(String[] args) {
		
		String str = "abcdab";
		
	Set<Character> set = new HashSet<>();
	
	for(int i=0;i<str.length();i++) {
		if(set.contains(str.charAt(i))==false) {
			set.add(str.charAt(i));
		}
	}
		System.out.println(set);
	}

}
