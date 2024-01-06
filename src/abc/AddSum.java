package abc;

public class AddSum {
	public static void main(String[] args) {
		
		int number= 1012245;
		int oddSum=0;
		int evenSum=0;
		
		
		while(number>0) {
			int digit =number%10;
			if(digit%2!=0) {
				oddSum =oddSum+digit;			
				}
			else {
				evenSum=evenSum+digit;
			}
			number = number/10;
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
	}

}
