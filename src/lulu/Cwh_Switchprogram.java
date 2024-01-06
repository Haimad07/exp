package lulu;

import java.util.Scanner;


public class Cwh_Switchprogram {

	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		switch(age){
			case 23:{
			System.out.println("you are going to join the job");
		    break;
			}
			case 60:
				System.out.println("You are going to retired");
		 break;
		 default:
			 System.out.println("you can enjoy your life");
		
		
		
	}
}
}
