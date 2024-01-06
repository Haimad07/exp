package practice;
/* 1.Iterate String in reverse.
 * 2.Read string of reverse index until length of string and convert this string to
 *   integer using wrapper class.
 * 3.Check the above integer is equal to the length of remaining string of 0 index
 *   to the iterating pointer index.
 * 4.If length is equal print that string.
 * 5.If length is not equal than increment reverse pointer and repeat the step2.
 */
public class PrintStringofAppendedLength {

	public static void main(String[] args) {
		
		String x ="123abc6";
		String c ="";
		
		for(int i=x.length()-1;i>0;i--) {
			
	        c =x.charAt(i)+c;
	        int z = Integer.parseInt(c);
	        if(x.substring(0,i).length()==z) {
	                   
	        	System.out.println(x.substring(0,i));
	        	System.exit(0);  
	        }
	    }
	}
}
