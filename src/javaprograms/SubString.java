package javaprograms;
import java.util.*;

public class SubString {

	public static void main(String[] args) {
		
		String mainStr ="this is my india";
		
		printPerms(mainStr,"is");
		
		
	}
	
	private static void printPerms(String mainStr,String subStr) {
		
		   List<String> perms = new ArrayList<>();
		   
		   for(int i=0;i<mainStr.length();i++) {
			   
			   if(i+2<mainStr.length()) {
				   
				   perms.add(mainStr.substring(i,i+2));
			   }
		   }
		   
		   int count = 0;
		   
		   for(String perm : perms) {
			   
			   if(subStr.equals(perm)) {
				   count++;
			   }
		   }
		   System.out.println(count);		
	}
}
