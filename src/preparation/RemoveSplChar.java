package preparation;

public class RemoveSplChar {
	public static void main(String[] args) {
	String x ="##!*(@(@()@(( ahmed pasha";
	
	String s =x.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(s);
	}
	
	

}
