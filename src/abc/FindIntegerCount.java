package abc;

public class FindIntegerCount {
	
	public static void main(String[] args) {
		
		String a = "123455slndkjn";
		int count=0;
		String x ="";
		int temp = 0;
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)>='1'&&a.charAt(i)<='9') {
				x=x+a.charAt(i);
				count++;
				temp=temp+1;
			}
			
		}
		if(temp==0) {
			System.out.println("It doesn't contain integer value");
		}
		System.out.println(count);
		System.out.println(x);
	}

}
