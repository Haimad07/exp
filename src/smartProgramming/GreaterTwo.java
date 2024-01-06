package smartProgramming;

import java.util.Scanner;

public class GreaterTwo {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("a");
		int a =sc.nextInt();
		
		System.out.println("b");
		int b=sc.nextInt();
		
		System.out.println("c");
		int c = sc.nextInt();
		
		
		if(a>b) {
			System.out.println(" 'a' is a greater number");
			
		}
		else {
			System.out.println(" 'b' is a greater number");
		}  
	}

}
