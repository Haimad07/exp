package smartProgramming;

public class PalindromeNumber {
         public static void main(String[] args) {
        	 
        	 int a =13331,rem,rev=0;
        	 int temp=a;
        	 
        	 while(a!=0) {
        		  rem=a%10;
        		  rev=rev*10+rem;
        		  a=a/10; 
        		  }
        	 if (temp==rev) {
        		 System.out.println("It is a palindrome");
        	 }
        	 else {
        		 System.out.println("It is not a palindrome");
        	 }
        	 }
         }

