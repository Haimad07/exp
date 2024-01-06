package lulu;

public class DeleteAllOccurrences {
	
	public static void main(String[] args) {
		
		String x ="SPIDERSLIES";
		 char y[]=x.toCharArray();
		 char key = 'S';
		 int i = 0;
		 String res=" ";
		 while(i!=y.length) {
			 
		 if(y[i]!=key) {
			 
			 res=res+y[i];
			 
		 }i++;
	}
		 System.out.println(res);
	}

}
