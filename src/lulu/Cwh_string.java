package lulu;

public class Cwh_string {
	
	public static void main(String[] args) {
		
		String s = "dada";
		
	    String  rev ="";
	    
	    
	    for(int i=s.length()-1;i>=0;i--) {
	    	
	    	rev=rev+s.charAt(i);
	    	
	    }
	    System.out.println(rev);
	    
	    if(s.equals(rev)) {
	    	 System.out.println("It is  a palindrome");
	    	
	    }
	    else {
	    	System.out.println("It is not a palindrome");
	    }
	}

}
