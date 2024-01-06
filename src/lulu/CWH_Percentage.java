package lulu;

import java.util.Scanner;

public class CWH_Percentage
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("subject 1");
	int a = sc.nextInt( );
	System.out.println("subject 2");
	int b = sc.nextInt( );
	System.out.println("subject 3");
	int c = sc.nextInt( );
	System.out.println("subject 4");
	int d = sc.nextInt( );
	System.out.println("subject 5");
	int e = sc.nextInt( );
	System.out.println("subject 6");
	int f = sc.nextInt( );
	System.out.println("The sum of the subjects are :");
    int sum = a+b+c+d+e+f;
    System.out.println(sum);
		float g=600;
	
	System.out.println("Percentage :");
	
	float percentage =( sum/g)*100;
	 
	 System.out.println(percentage);
	
	}

}
