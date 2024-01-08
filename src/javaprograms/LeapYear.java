package javaprograms;

public class LeapYear {

	public static void main(String[] args) {
		int y =6;
		int x = 2018;
		
		if((x%400==0)||(x%4==0&&x%100!=0)) {
			System.out.println("It is a leap year");
			
		}
		else {
			System.out.println("it is not a leap year");
		}
	}
}
