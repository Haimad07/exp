package lulu;

public class Practice20 {

	public static void main(String[] args) {
		
		String x = "radar";
		String res="";
		for(int i=x.length()-1;i>=0;i--) {
			res = res+x.charAt(i);
		}
	    System.out.println(res);
	    
	    if(res.equals(x)) {
	    	System.out.println("It is a palindrome");
	    }
	    else {
	    	System.out.println("It is not a palindrome");
	    }
	}
}
