package lulu;

import java.util.Scanner;
public class Cwh_elseifprogram {
	
	public static void main(String[] args) {
	
		int age ;
		System.out.println("Enter the Age: ");
		Scanner sc = new Scanner(System.in);
		age= sc.nextInt();
	
		if(age>56) {
			System.out.println("You are experienced");
			
		}
		else if(age>40) {
			System.out.println("You  Are Semi Experienced");
		}
		else {
			System.out.println("You are not experienced");
		}
	}

}
