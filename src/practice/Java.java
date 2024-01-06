package practice;
import java.util.*;

public class Java {
public static void main(String[] args) {
	
	     String mainStr ="this is my india";
	     String subStr ="is";
	     
	     List<String> list = new ArrayList<>();
	     
	     for(int i=0;i<mainStr.length();i++) {
	    	 
	    	 if(i+2<mainStr.length()) {
	    		 list.add(mainStr.substring(i,i+2));
	    		 
	    	 }
	    		 
	     }
	     int count =0;
	     
	     for(String perms:list) {
	    	 if(subStr.equals(perms)) {
	    		 count++;
	    	 }
	     }
	     System.out.println(count);

}
}
