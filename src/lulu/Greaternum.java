package lulu;

import java.util.Scanner;

public class Greaternum {

	public static void main(String[] args)
{
		Scanner var = new Scanner(System.in);
		System.out.println("Enter the number a ");
         int a = var.nextInt();
         System.out.println("Enter the number b");
         int b =var.nextInt();
         
         if(a>b) {
        	 System.out.println("the greatest number is a =  "+a);
        	 
         }
         else {
        	 System.out.println("the greatest number is b = "+b);
         }
}
}
