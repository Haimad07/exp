package javaprograms;

public class FirstaletteraupperCase {

	public static void main(String[] args) {
		
		String x = "clarivate analytics";
		
		char y[] = x.toCharArray();
		
		
		y[0]=(char)(y[0]-32);
		
		for(int i=1;i<y.length;i++) {
			if(y[i]==' ') {
             y[i+1]=(char)(y[i+1]-32);
		     }
			i++;
			}
		System.out.println(y);
	}
}
