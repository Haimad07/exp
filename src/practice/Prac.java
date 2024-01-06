package practice;

import java.util.*;

public class Prac {

	public static void main(String[] args) {
		
        int a[]= {1,2,2,3,3,4,4,5};
        
        Set<Integer> dup = new HashSet<>();
        
       for(Integer x:a) {
    	   
    	   if(dup.add(x)) {
    		   System.out.print(" " +x);
    	   }
       }
        
		
	}
}
