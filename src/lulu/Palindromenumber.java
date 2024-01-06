package lulu;

public class Palindromenumber {
public static void main(String[] args) {	
	String n ="133312";
	
	 String rev ="";
	 
	 for(int i=n.length()-1;i>=0;i--) {
		 
		 rev =rev+n.charAt(i);	 
	 }
	 System.out.println(rev);
	 if(rev.equals(n)){
		 System.out.println("It is a palindome");
		 }
	 else {
		 System.out.println("it is not a palindrome");
	 }
  }

}
