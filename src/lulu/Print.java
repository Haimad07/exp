package lulu;
import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      String A=sc.next();
      String B=sc.next();
      /* Enter your code here. Print output to STDOUT. */
      int x =A.length()+B.length();
      System.out.println(x);
      System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
	}   

}
