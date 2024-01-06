package abc;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	
	public static void main(String[] args) {
		// Initialize an integer array with some values. 
		int[] a = {1,2,2,3,3,4,5,6,6,7};
		
		// Create a HashSet to store unique values.
		Set<Integer> s = new HashSet<>();
		
		// Loop through each element in the array
		for(int no:a) {
			
			// Use the add() method of HashSet to add the element to the set.
			// If the element is already present in the set,it is a duplicate 
			if(s.add(no)==false)
			{
				
				// Print the value of the  duplicate element.
				System.out.print(no); 
				}
			}
		
		
	}

}
