package preparation;

public class FindlengthRemainString {

public static void main(String[] args) {
	  String str ="abcdefghijklmnopqrstuvwxyz26";
	  String num="";
	  
	  for(int i=str.length()-1;i>=0;i--) {
		  
		  num = str.charAt(i)+num;
		  int x =Integer.parseInt(num);
		  
		  if(str.substring(0,i).length()==x) {
			  System.out.println(str.substring(0,i));
			  System.exit(0);
		  }
		  
	  }
}
	
	
}
