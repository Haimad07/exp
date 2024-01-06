package lulu;

import java.util.*;
public class Substring {
	
	public static void main(String[] args) {
		
		String mainStr = "this is my india";
		
		printSubstringCount(mainStr,"is");
	}
	
	private static void printSubstringCount(String mainStr,String subStr) {
		
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


