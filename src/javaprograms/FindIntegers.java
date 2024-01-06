package javaprograms;

public class FindIntegers {
	
	public static void main(String[] args) {
		
		String x = "1234dd5";
		
		char y[] = x.toCharArray();
		
		int i=0;
		
		while(i!=y.length) {
			
			if(y[i]>='0'&&y[i]<='9') {
				i++;
			}
			else {
				System.out.println("It is not a Integer");
				System.exit(0);
			}
		}
			System.out.println("It is a integer");
		}
	}


