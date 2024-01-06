package lulu;

public class Practice32Perms {
	
	public static void main(String[] args) {
		      String str="ABC";
		      printPermutations(str, "", 0);
		      
	}

	
	private static void printPermutations(String str,String perms,int ind) {
		
		for(int i=0;i<str.length();i++) {
			
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i)+str.substring(i+1);
			printPermutations(newStr,perms+currChar,ind+1);
			
		}
		if(str.length()==0){
			System.out.println(perms);
		}
	}	
}
