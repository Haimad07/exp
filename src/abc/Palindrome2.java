package abc;

public class Palindrome2 {

	public static void main(String[] args) {
		
		   String x ="madam";
		    x=x.replace(" ","");
		   
		   System.out.println(x);
		   String res = "";
		   
		   for(int i=x.length()-1;i>=0;i--) {
			   
			   res=res+x.charAt(i);   
		   }
		   
		   System.out.println(res);
		   
		   if(res.equals(x)) {
			   System.out.println("It is a Palindrome");
		   }
		   else {
			   System.out.println("It is not a Palindrome");
		   }
	}
}
