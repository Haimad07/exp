package lulu;

public class Cwh_trycatchpro {
	
	public static void main(String[] args) {
		
		try {
			int a[]=new int[7];
			a[0]=8;
			System.out.println(a[5]);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block"); 
		}
	}
}
