package javaprograms;

public class HigherToLowerCase {
	
	public static void main(String[] args) {
		
		String x = "AHMED";
		
		char y[] = x.toCharArray();
		
		int size = y.length;
		
		for(int i=0;i<size;i++) {
			
			y[i] = (char)(y[i]+32);
		}
		
		System.out.println(y);
	}

}
