package javaprograms;

public class Palindrome {
	
	public static void main(String[] args) {
		
		 String x = "amma";
		 
		 String y ="";
		 
		 for(int i = x.length()-1;i>=0;i--) {
			 
			 y = y+x.charAt(i);
		 }
		 
		 System.out.println(y);
		 if(y.equals(x)) {
			 System.out.println("It is a Palindrome");
		 }
		 else {
			 System.out.println("It is not a Palindrome");
		 }
	}

}
