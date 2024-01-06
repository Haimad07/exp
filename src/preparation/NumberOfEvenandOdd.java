package preparation;

public class NumberOfEvenandOdd {
	
	public static void main(String[] args) {
		int number = 123456;
		int evenCnt=0;
		int oddCnt=0;
		
		while(number!=0) {
			
		 int digit = number%10;
		 
		 if(digit%2==0) {
			 evenCnt++;
		 }
		 if(digit%2!=0) {
			 oddCnt++;
		 }
		 number=number/10;
		}
		System.out.println("even count "+ evenCnt);
		System.out.println("odd count  "+ oddCnt);
		
	}

}
