package practice;

public class FirstCharUpperInWOrd {
	public static void main(String[] args) {
		
		String x ="this is my india";
		
		String[]words =x.split("\\s+");
		
		String[] word=new String[words.length];
		String wordss="";
		for(int i=0;i<words.length;i++) {
			 word[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
			}
		System.out.println(String.join(" ", word));
	}

}
