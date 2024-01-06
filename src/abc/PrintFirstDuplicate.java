package abc;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintFirstDuplicate {
	
	public static void main(String[] args) {
		
		int a[]= {5,5,6,6,1,1,2,3,4,9,2};
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for(int no:a) {
			
			if(s.add(no)==false) {
				System.out.print(no+" ");
			}
		}
	}

}
