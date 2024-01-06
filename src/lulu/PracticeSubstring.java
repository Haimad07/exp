package lulu;

import java.util.*;

public class PracticeSubstring {
	
	public static void main(String[] args) {
	
	String mainStr ="this is my india";
	//th hi is s i is s  m my y   i in nd ia
	printPermutations(mainStr,"is");
	
}

private static void printPermutations(String mainStr,String subStr) {
	
	List<String> perm = new ArrayList<>();
	 
	for(int i=0;i<mainStr.length();i++) {
     if(i+2<mainStr.length()) {
		perm.add(mainStr.substring(i, i+2));
		}
	}
	int count =0;
	
	for(String perms:perm) {
		if(subStr.equals(perms)) {
			count++;
		}
	}
	System.out.println(count);
	}
}