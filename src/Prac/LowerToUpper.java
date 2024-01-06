package Prac;

public class LowerToUpper {

	public static void main(String[] args) {
		
		 String x ="ahmed";
		 char y[] = x.toCharArray();
		 int size = y.length;
		 char a[] = new char[size];
		 
		 for(int i=0;i<size;i++) {
			 a[i]=y[i];
		 }
	}
}
