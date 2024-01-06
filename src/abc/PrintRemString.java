package abc;

public class PrintRemString {
	
	public static void main(String[] args) {
		
		String x ="123456789010";
		
		String num = "";
		
		
		for(int i=x.length()-1;i>=0;i--) {
			
			num = x.charAt(i)+num;
		  int z = Integer.parseInt(num);
		
		if(x.substring(0, i).length()==z) {
			
			System.out.println(x.substring(0, i));
			System.exit(0);
		}
			
			
		}
	}

}
