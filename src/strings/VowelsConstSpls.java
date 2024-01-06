package strings;

public class VowelsConstSpls {
	
	public static void main(String[] args) {
		
		String x="ARADHAYA'S BRILLIANCE CENTER";
		
		char y[] = x.toCharArray();
		
		int size = y.length,
		
		vowcnt = 0,
		 
		conscnt = 0,
		
		splcnt= 0;
		
		int i =0 ;
		 
		while(i!=size) {
			if(y[i]>='A'&&y[i]<='Z') {
	
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U') {
					
					++vowcnt;
				}
				else {
					++conscnt;
				}
			}
			
			else {
				++splcnt;
			}
			i++;
			
		}
		System.out.println(vowcnt);
		System.out.println(conscnt);
		System.out.println(splcnt);
		}

}

