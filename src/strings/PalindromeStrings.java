package strings;

public class PalindromeStrings {
	
	public static void main(String[] args) {
		
		String x = "lulul";
		   x=x.toLowerCase();
		   x=x.replace(" ","");
	 	
		char y[]=x.toCharArray();
		
		int size = y.length;
		
		char a[] = new char[size];
	
		int i ;
		
		for(i=0;i<size;i++) {
			
			a[size-1-i]=y[i];
		
		}
		System.out.println(y);
		System.out.println(a);
		
		 i=0;
		
		while(i!=size) {
		
		if(a[i]!=y[i]) {
			System.out.println("It's not a palindrome.");
			System.exit(0);
			
		}
		else
		{
		 ++i;
		 
		}
		}
		System.out.println("its is a palindrome");
	}
}
