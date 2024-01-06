package lulu;

public class Patterns1 {
	
	public static void main(String[] args) {
		
	
		
		for(int i=1;i<=5;i++) {
			
			for(int r=1;r<=i;r++) {
				
				System.out.print("*");
			}System.out.println("");
		}

		for(int i=1;i<=5;i++) {
			
			for(int r=3;r>=i;r--) {
				
				System.out.print("*");
			}System.out.println("");
		}
	}

}
