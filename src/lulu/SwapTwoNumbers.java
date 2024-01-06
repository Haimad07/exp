package lulu;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
	/*	int a =10;
		int b =12;
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);*/
		
		int a = 10;
		int b = 20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
		
	}

}
