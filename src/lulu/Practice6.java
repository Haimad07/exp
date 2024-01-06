package lulu;

public class Practice6 {
	
	public static void main(String[] args) {
		
			    String str="1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890100";
			    int len = str.length();
            
			    String num = "";

			    for (int i = str.length() - 1; i >= 0; i--) {
			      
			      num = str.charAt(i) + num;
			      int x = Integer.parseInt(num);

			      if (str.substring(0, i).length() == x) {
			        
			        System.out.println(str.substring(0, i));
			        break;
			      }
			        else {
			        	System.out.println("Invalid String");
			        }
			      }
			      
			    }
	}
