package javaprograms;

public class PrintRemLength {
	
	public static void main(String[] args) {
		String x ="abcdefghijklmnopqrstuvwxyz26";
		
		String num="";
		
	     for(int i=x.length()-1;i>=0;i--) {
	    	   num = x.charAt(i)+num;
	    	   int y =Integer.parseInt(num);
	    	   
	    	   if(x.substring(0, i).length()==y) {
	    		   System.out.println(x.substring(0, i));
	    		   System.exit(0);
	    	   }
	    	  
	     }
	}

}
