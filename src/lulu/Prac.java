package lulu;

public class Prac {
public static void main(String[] args) {
	
	String str = "abc";
	printPermutation(str,"",0);
}

public static void printPermutation(String str,String perm,int ind) {
	
	for(int i=0;i<str.length();i++) {
		
		char currChar = str.charAt(i);
		
		String newStr = str.substring(0,i)+str.substring(i+1);
		
		printPermutation(newStr,perm+currChar,ind+1);
		
	}
	if(str.length()==0) {
		System.out.println(perm);
	}
}
}
