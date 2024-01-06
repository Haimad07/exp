package smartProgramming;

public class FibonacciSeriesUSingRec {
	static int a=0,b=1,c;
	public static void main(String[] args) {
		
		System.out.print(a+" "+b);
		
		FibonacciSeriesUSingRec f = new FibonacciSeriesUSingRec();
		    f.fibRec(10);
	}
	void fibRec(int i) {
		if(i>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibRec(i-1);
		}
		
	}

}
