package strings;

public class FindlenghtOfString {
	
	public static void main(String[] args) {
		
		String x = "Babu Miya";
		 x=x.concat("\0");
		 
		 char y[] = x.toCharArray();
		 
		 int count=0;
		 int i=0;
		 while(y[i]!='\0') {
			 
			 ++count;
			 ++i; 
		 }
		 System.out.println(count);
		 System.out.println(i);
		 System.out.println(x);
	}

}
