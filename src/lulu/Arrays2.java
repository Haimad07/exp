 package lulu;

public class Arrays2 {
	
	public static void main(String[] args) {
		
		int a[][][]= {{{20,30,40},{60,70,80}},{{90,100,200},{20,30,40}}};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				for(int k=0;k<a[i][j].length;k++) {
					
					System.out.print(a[i][j][k]+" ");
					
				}
				System.out.println();
			}
			
		}
		
	}

}
