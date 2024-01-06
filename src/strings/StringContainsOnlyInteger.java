package strings;

public class StringContainsOnlyInteger {
	
	public static void main(String[] args) {
		
		String x = "123456";
		
		char y[] = x.toCharArray();
		
		int size = y.length;
		
		int i = 0;
		
		while(i!=size) {
			if(y[i]>='0'&&y[i]<='9') {
				
				
				++i;
			}
			else {
				System.out.println("not a integer");
				System.exit(0);
			}
	}
		System.out.println("Integer String");
	}
}
