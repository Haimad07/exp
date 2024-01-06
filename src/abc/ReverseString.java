package abc;

public class ReverseString {
	
	public static void main(String[] args) {
		String x= "AQSA";
		String res="";
		
		for(int i=x.length()-1;i>= 0;i--) {
			
			res = res + x.charAt(i);
			
		}
		
		System.out.println(res);
	}

}
