package abc;

public class AddSum1 {

	public static void main(String[] args) {
		
		int number =1074356;
		int oddSum=0;
		int evenSum=0;
		while(number>0) {
			int digit = number%10;
			
			if(digit%2!=0) {
				oddSum = oddSum+digit;
			}
			else {
				evenSum =evenSum+digit;
			}
			number = number/10;
			
		}
		
		System.out.println("oddsum = "+ oddSum+" evenSum = "+evenSum);
	}
}
