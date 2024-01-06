package practice;
import java.util.*;
public class RemoveDuplicateArrays {

	public static void main(String[] args) {
		
		int a[] = {20,40,30,10,5,20,40,30};
		
		Set<Integer> s = new HashSet<>();
		
		for(int no:a) {
			if(s.add(no)==false) {
				System.out.print(" "+no);
				
			}
		}
	}
}
