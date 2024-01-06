package lulu;

public class Practice22 {

	public static void main(String[] args) {
		
		String x ="123456789";
		char y[]=x.toCharArray();
		
		int l = y.length;
		 
		char a[]= new char[l];
		
		
	if(l>=0&&l<=10) {
			
			for(int i=0;i<y.length-1;i++) {
				a[i]=y[i];
					
			}
			System.out.println(a);
	}
			else if(l>=11&&l<=100) {
		for(int j=0;j<y.length-2;j++) {
			a[j]=y[j];
		}
		System.out.println(a);
}
			else {
				for(int k=0;k<y.length-3;k++) {
					a[k]=y[k];
			}
				System.out.println(a);
 	
   }
   }
   }