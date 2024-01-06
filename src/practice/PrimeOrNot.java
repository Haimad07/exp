package practice;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int no=19; 
		int temp=0;
		for(int i=1;i<no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
			}
			}
		if(temp>1) {
			System.out.println("it is a not prime number ");
		}
		else {
			System.out.println("It is  a prime number");
		}
		}
	}


