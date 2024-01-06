package abc;

public class PrintPrime {
	
	public static void main(String[] args) {
		
		int n=11;
		int temp = 0;
		
		 for(int i=2;i<n-1;i++) {
			if(n%2==0) {
				temp = temp+1;
			
			}
		}
		 if(temp>=1) {
			 System.out.println("It is a not a prime number");
		 }
		 else {
			 System.out.println("It is a prime number");
		 }
	}
	

}
