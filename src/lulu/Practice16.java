package lulu;

public class Practice16 {
	
	public static void main(String[] args) {
		
		String a ="Hello";
		String b ="World!";
		
		System.out.println(a);
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		System.out.println(b);
		System.out.println(a);
		
	}

}
