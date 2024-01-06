package qualitythought;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int number = 1234;
		
		String res="";
		
		while(number>0) {
			int digit =number%10;
			res = res+digit;
			number=number/10;
		}
		System.out.println(res);
	}

}
