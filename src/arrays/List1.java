package arrays;

//input = 104055

public class List1 {
	
	public static void main(String[] args) {
		
	
	
	int  a = 104055779;
	
	int sum = 0;
	int i =0;
	while(i<a) {
		
		int b = a%10;
		if(b%2!=0) {
			sum= sum+b;
		}
		a=a/10;
	}
System.out.println(sum);
	}

}
