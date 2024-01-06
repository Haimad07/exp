package preparation;

public class PrimeorNot {
  
	public static void main(String[] args) {
		
		     int a= 11;
		     int temp=0;
		     for(int i=2;i<a-1;i++) {
		    	 
		    	 if(a%2==0) {
		    		 temp=temp+1;
		    	 }
		     }
		     
		     if(temp>=1) {
		    	 System.out.println("It is not a prime number");
		     }
		     else {
		    	 System.out.println("It is a prime number");
		     }
		     
		               
	}

}
