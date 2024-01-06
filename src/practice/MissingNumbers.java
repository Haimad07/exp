package practice;

import java.util.*;

public class MissingNumbers {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,7,8,9,0,11,14};
		
		Set<Integer>set=new HashSet<>();
		
		for (int s:a) {
			set.add(s);
		}
		
		int n = a.length+4;
		
		for(int i=0;i<n;i++) {
			if(set.contains(i)==false) {
				System.out.println(i);
			}
		}
	}

}
