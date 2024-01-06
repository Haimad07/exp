package preparation;

public class ReverseWord {
    public static void main(String[] args) {
    	
    	String x="Welcome to Java";
    	
    	String[] words = x.split(" ");
    	
    	String reverseWord ="";
    	
    	for(String w:words) {
    		String word ="";
    		for(int i=w.length()-1;i>=0;i--) {
    			word =word+w.charAt(i);
    		}
    		reverseWord=reverseWord+word+" ";
    		
    		
    	}
    	System.out.println(reverseWord);
    }
}
