package lulu;

public class FindLength2 {
	
	public static void main(String[] args) {
	
	String str ="123455558";

	String num = "";
	
	for(int i =str.length()-1;i>=0;i--) {
		   num = str.charAt(i)+num;
	     int x = Integer.parseInt(num);
	     
	     if(str.substring(0,i).length() == x) { 
	    	 System.out.println(str.substring(0,i));
	    	 break;
	     }
	}
	
	
	
	
	}
}
