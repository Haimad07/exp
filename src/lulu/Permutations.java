package lulu;

public class Permutations {
	
	public static void main(String[] args) {
		
		String str = "ABC";
		printPermutations(str,"",0);
		
	}

	public static void printPermutations(String str,String perm,int ind) {
		
		for(int i=0;i<str.length();i++)
		{
			char currChar =str.charAt(i);
			String newStr =str.substring(0,i)+str.substring(i+1);
			printPermutations(newStr,perm+currChar,ind+1);
		}
		if(str.length()==0) {
		System.out.println(perm);
		}return;
	}
}
