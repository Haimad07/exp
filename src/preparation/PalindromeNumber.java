package preparation;

public class PalindromeNumber {  
	public static void main(String[] args) {
		

	    int number=121;
		int temp=number;
		
		int rev =0;
		
		while(temp!=0) {
			rev = rev*10+temp%10;
			temp=temp/10;
		}
		
		System.out.println(rev);
	
		if(number==rev) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
	}
	 
}
