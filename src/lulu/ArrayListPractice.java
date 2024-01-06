package lulu;



public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		String x ="ab,bc,fg,gh";
		
		char y[] = x.toCharArray();
		
		int count =0;
		
		for(int i=0;i!=y.length;i++)
		{
			
			if(y[i]>='a'&& y[i]<='z') {
				
			++count;
			
			}
			else {
				
			}
		
		}
		System.out.println(count);
	
	}
	
	

}
