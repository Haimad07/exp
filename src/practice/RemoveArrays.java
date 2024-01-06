package practice;
import java.util.*;
public class RemoveArrays {
	public static void main(String[] args) {
		int a[]= {2,3,3,4,4,5,5,6,6,7,8,9,9}; 
		
		Set<Integer> s = new HashSet<>();
		
		for(Integer no:a) {
			if(s.add(no)==false){
				System.out.print(no);	
			}
		}
		//System.out.println(s);
		
	}

}
