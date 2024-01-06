package practice;

public class Perm1 {
 public static void main(String[] args) {
	 
	 String str ="abcd";
	 
	 printPerms(str,"",0);
 }
 
 private static void printPerms(String str,String perm,int ind) {
	 
	 
	 for(int i=0;i<str.length();i++) {
	 char currStr = str.charAt(i);
	 String newStr = str.substring(0,i)+str.substring(i+1);
	 printPerms(newStr,perm+ currStr,ind+1);
	 }
	 
	 
	 if(str.length()==0) {
		 System.out.print(" "+perm);  
	 } 
	 
 }
}
