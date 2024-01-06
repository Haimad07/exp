package preparation;

import java.util.*;

public class FindDuplicatesInArray {
	public static void main(String[] args) {
	
	 int a[]= {10,20,30,30,40,40,50,50,60};
	 
	 Set<Integer> s = new HashSet<>(); 
	 
	  for(int no:a) {
		  if(s.add(no)==false) {
			  System.out.println(no);
		  }
		  
	  }
	 
	 
	 }
}
