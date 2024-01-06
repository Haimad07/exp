package lulu;

public class Practice19 {
	
	public static void main(String[] args) {
		
	/*	int     a = 1234567890;
	    double  b = 1234512345;
		float   c = 1234512345;
		short   d = 12345;
		long    e = 1234567891;
		char    f = 'c';
		boolean g = true; */
		
		String originalString ="Ahmed";
		String keyString ="hmedA";
		String newString = originalString.concat(originalString);
		
		if(newString.contains(keyString)) {
			
			System.out.println("It is a Rotational String");
		}
		else {
			System.out.println("It is not a Rotational String");
		}
		
		
	}

}
