package strings;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String x ="123";
		Integer b=100;
		int c=Integer.parseInt(x);
		
		char y[]=x.toCharArray();
		
	    int	size = y.length;
	    
	    char a[] = new char[size];
	    
       for(int i =0;i!=size;i++) {
	    	
    	   a[size-1-i]=y[i];
    	   
	    }
   	System.out.println(y);
	System.out.println(a);
	System.out.println(c);
	}
}
