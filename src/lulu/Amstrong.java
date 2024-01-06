package lulu;

public class Amstrong {
	
	public static void main(String[] args) {
		
		int a =371;
		int sum=0;
		
		while(a>0) {
			int digit = a%10;
			sum=sum+digit*digit*digit;
			a=a/10;
		}
		System.out.println(sum);
	}

}
