package arrays;

//Steps:
//1. Get the input from user using scanner class.
//2. Initialize variable sum to 0  to store the sum of the odd digits.
//3.
import java.util.Scanner;
public class Abb {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int number = sc.nextInt();
		
		int sum = 0;
		
		while(number>0) {
			int digit = number%10;
			if(digit%2!=0) {
				sum= sum + digit;
			}
			number = number/10;
		}
		System.out.println(sum);
	}
}
