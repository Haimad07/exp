package arrays;

public class Pangram {
	public static void main(String[] args) {
		String x ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		x=x.replace(" ","");
		char y[] =x.toCharArray();
		
		int z[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.print(z.length);	
		
		int i=0;
		for(i=0;i<y.length;i++) {
			int index =y[i]-65;
			z[index]=1;
		}
		i=0;
		while(i!=26) {
			if(z[i]==1) {
				i++;
			}
			else {
				System.out.println("not a anaggram");
			}
		}
		System.out.println("is a anagram");
		}

}
