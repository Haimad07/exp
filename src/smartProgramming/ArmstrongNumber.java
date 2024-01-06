	package smartProgramming;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		/* Armstrong number
		 * eg:- 153 =1^3+5^3+3^3=153
		 */
	     int no=153;
	     int r;
	     int sum=0;
	     
	     while(no>0) {
	    	 r=no%10;
	    	 sum=sum+r*r*r;
	    	 no=no/10;	  
	     }
	     System.out.print(sum);
	}

}
