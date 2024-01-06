package strings;

public class GoPractice {
	
	public static void main(String[] args) {
		
		/*int[] a={20,30,40,50,60};	
		
		int sum=0;
		int i=0;
		for(int data:a) {
			
			sum=sum+data;
			System.out.print(sum);
		}
		
		System.out.println("   ");
		System.out.println(sum);*/
		
		    String x= "wefffgggg";
           
            int [] arr = new int [127];
            
            for(int i=0;i<x.length();i++)
            {
            	arr[x.charAt(i)]=arr[x.charAt(i)]+1;
            }
    		int max = -1;
    		char c =0;
    		
    		for(int i=0;i< x.length();i++) {
    		 if(max < arr[x.charAt(i)]) {
    			 
    			 max=arr[x.charAt(i)];
    			 
    			 c=x.charAt(i);
    		 }
    		
    		}
    		System.out.println(c);
            
             
		  
		}
	}


