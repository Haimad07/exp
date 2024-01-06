package strings;

public class CopyString {
	
	public static void main(String[] args) {
		
		String x ="KHADEER AHMEd";
		
		char y[]= x.toCharArray();
		
		int size = y.length;
		
		char a[] = new char[size];
		 
		
		for(int i=0;i!=size;i++) {
			a[i]=y[i];
		}
	
		
		System.out.println(y);
		System.out.println(a);
	}

}
