package smartProgramming;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		int no=7,temp=0;
		
		for(int i=2;i<=no-1;i++) {
			
			if(no%i==0) {
			   temp=temp+1;	
			}
		}
			if(temp>=1) {
				System.out.println("It is a not prime number");
			}
			else {
				System.out.println("It is a prime number");
			}
		}
	}


