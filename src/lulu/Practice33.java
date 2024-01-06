package lulu;

public class Practice33 {
	
	public static void main(String[] args) {
		
			    String str = "abcdefghijklmnopqrstuvwxyz26";
			    int len = str.length();
			    
			    String num = "";

			    for (int i = str.length() - 1; i >= 0; i--) {
			      // Concatenate the current character to the beginning of num
			      num = str.charAt(i) + num;
			      int x = Integer.parseInt(num);

			      if (str.substring(0, i).length() == x) {
		           // The length of the string, excluding the number, is equal to the number
			        System.out.println(str.substring(0, i));
			        System.exit(0);
			      }
			    }

			    if (num.length() > 2) {
			      // The loop completed and the condition was not met
			      System.out.println("length of the string does not match number appended at its end.");
			    }
			  }
				  
}


	


