package lulu;

public class Cwh_trycatch1 {
	public static void display() {
		try {
			int a=70/0;
			System.out.println(a);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		display();
	    
		
	}

}
