package practice;

public class FindIntegerCount {
	
	public static void main(String[] args) {
		
		String x ="123ab4567";
		
		int count=0;
		
		
		for(int i=0;i<x.length();i++) {
			
			if(x.charAt(i)>='1'&&x.charAt(i)<='9') {
				
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
