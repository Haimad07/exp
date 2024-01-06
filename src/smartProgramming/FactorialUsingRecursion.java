   package smartProgramming;

public class FactorialUsingRecursion {

	static int fact=1;
public static void main(String[] args) {
	
	int no =5;
	
	      calcFact(no); 
	      System.out.println(fact);
	      
   }   

       public static void calcFact(int no) {
        	   
        	   if(no>1) {
        		   fact=fact*no;
        		   calcFact(no-1);
        	   }
           }
	   }

