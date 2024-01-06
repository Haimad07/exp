   package strings;

public class FindCountOfInteger {
	
	public static void main(String[] args) {
		
		String x= "A1B2CCCD4hdghdgh";
				
		 char y[]=x.toCharArray();
		 
		 int size  = y.length;
		 
		 int count =0;
		 int i=0;
		 
		while(i!=size) {
			 if(y[i]>='0'&&y[i]<='9') {
				 
				 ++count;
			 }
			 
			 i++;
			
		}
		 System.out.println(count);
		 
		
	}

}
