package Prac;

public class CopyString {
	
	public static void main(String[] args) {
		
		String x ="ahmed";
		String y="";
		
		for(int i=0;i<x.length();i++) {
			y = y+x.charAt(i);
		}
		System.out.println(x);
		System.out.println(y);
	}

}
