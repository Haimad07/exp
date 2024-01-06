package smartProgramming;
import java.util.Scanner;

public class CalculaterUSingSwitch {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Number a:");
		 int a =s.nextInt();
		 
		 System.out.println("Number b:");
		 int  b=s.nextInt();
		 
		 System.out.println("Select symbol(+,-,*,/)");
		
		 String sym=s.next();
		 int res;
		 
		 switch(sym) {
		 case "+": res = a+b;
			      System.out.println(res);
			       break;
			
		 case "-": res = a-b;
		          System.out.println(res);
		           break;
		 case"*": res =a*b;
		          System.out.println(res);
		           break;
		 case"/": res = a/b;
		 System.out.println(res);
		           break;
		 
		 default : 
			 System.out.println("Enter a valid symbol");
			 
		 }
	
	}

}
