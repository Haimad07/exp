package company.com;
import java.util.Scanner;


public class Calculater {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	try {
	System.out.println("Enter the number a :");
	 int a =sc.nextInt();
	 System.out.println("Enter the number b :");
	 int b = sc.nextInt();
	 
	 System.out.println("enter the operator :");
	 
	 String sym = sc.next();
	 
	 int res ;
	 
	 switch (sym) {
	 case "+":
		    res = a+b;
		    System.out.println(res);
		    break;
	 case "-":
		  res = a-b;
		  System.out.println(res);
		  break;
	 case "*":
		 res = a*b;
		 System.out.println(res);
		 break;
	 case "/":
		 res = a/b;
		 System.out.println(res);
		 break;
		    
	
	 default:
		 System.out.println("Entered operator is invalid");
	 } 
	}
	catch(Exception e){
		System.out.println("Entered number is invalid");
	}
	}
}
