package javaprograms;

public class CopyOneToAnotherString {

	public static void main(String[] args) {
		 String x = "ahmed";
		 String y ="";
		 System.out.println(x);
		 for(int i=0;i<x.length();i++) {
			 
			 y = y+x.charAt(i);
		 }
		 System.out.println(y);
	}
}
