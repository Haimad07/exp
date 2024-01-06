package javaprograms;

public class Permutations {
	
	public static void main(String[] args) {
		String str ="ABC";
		
		printPermutations(str,"",0);
	}
	
	private static void printPermutations(String str,String perm,int ind) {
              
		for(int i=0;i<str.length();i++) {
			
		char currStr = str.charAt(i);
		String newStr = str.substring(0, i)+str.substring(i+1);
		
		printPermutations(newStr,perm+currStr,ind+1);
		
		}
		
		if(str.length()==0) {
			System.out.println(perm);
		}
	}

}
