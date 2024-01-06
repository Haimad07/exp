package preparation;

public class Factorial {
	 static int f=1;
	public static void main(String[] args) {
	               int n ;
	         Factorial fact =new Factorial();
	              fact.calFact(5);
	              
	              System.out.println(f);
	}
	
	          void calFact(int n) {
		 
		 if(n>=1) {
			 f=f*n;
			 calFact(n-1);
			 
		 }
		 
		 
	 }
}