package practice;

import java.util.Arrays;

public class ReverseEachWord {
	public static void main(String[] args) {
		String x ="This is my India";
		
		String[] word = x.split("\\s+");
		System.out.println(Arrays.toString(word));
	
		String total_String="";
		for(String w:word) {
			String words="";
			for(int i=w.length()-1;i>=0;i--) {
				words=w;
			}
			total_String=words+" "+ total_String;
		}
		System.out.println(total_String);			}

}
