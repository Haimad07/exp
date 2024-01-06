package abc;

public class AddSumofEven {
	
	public static void main(String[] args) {
		
		int number = 200024813;
		
		int evenSum =0;
		int oddSum=0;
		while(number>0) {
			int digit = number%10;
			if(digit%2==0) {
				evenSum=evenSum+digit;
			}
			else {
				oddSum=oddSum+digit;
				
			}
			number = number/10;
		}
		System.out.println("evensum= "+evenSum+" "+"oddsum= "+oddSum);
	}

} 
