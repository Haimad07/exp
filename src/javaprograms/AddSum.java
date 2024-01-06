package javaprograms;

public class AddSum {
	
	public static void main(String[] args) {
		
		int number =1024657;
		int sum=0;
		
		while(number>0) {
			int digit = number%10;
			if(digit%2==0) {
				sum = sum+digit;
			}
			number = number/10;
		}
		
		System.out.println(sum);
	}

}
