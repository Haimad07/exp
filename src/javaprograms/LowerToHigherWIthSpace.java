package javaprograms;

public class LowerToHigherWIthSpace {
	
	public static void main(String[] args) {
		
		String x ="aradhya brilliance center";
		
		char y[] =x.toCharArray();
		
		for(int i =0;i<y.length;i++) {
			
			if(y[i]!=' ') {
				y[i]=(char)(y[i]-32);
			}
		}
		System.out.println(y);
	}

}
