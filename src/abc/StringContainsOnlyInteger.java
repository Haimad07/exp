package abc;

public class StringContainsOnlyInteger {
	
	public static void main(String[] args) {
		String x = "123456abc";
		
		char y[]=x.toCharArray();
		int size = y.length;
		
		
		for(int i = 0 ;i<size;i++) {
			
			if(y[i]>='1' && y[i]<='9') {
				
			}
			else {
				System.out.println("It is not an integer");
				System.exit(0);
			}
		
		}
		System.out.println("It is an Integer");
		
	}

}
