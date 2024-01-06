package lulu;

public class Practice7 {
	
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz26";
		int len = str.length();

		String num = "";

		for (int i = str.length() - 1; i >= 0; i--) {
		  num = str.charAt(i) + num;
		  int x = Integer.parseInt(num);

		  if (str.substring(0, i).length() == x) {
		    // The length of the string, excluding the number, is equal to the number
		    System.out.println(str.substring(0, i));
		    break;
		  }
		 
		 }
		
	}

} 
