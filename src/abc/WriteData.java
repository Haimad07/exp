package abc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr =new FileWriter("C:\\Users\\user4\\Desktop\\ahned.txt");
		
		BufferedWriter bw = new BufferedWriter(fr);
		
		bw.write("My name is Ahmed. ");
		bw.write("I completed my b.e");
		
		bw.close();
		System.out.println("Finished....!");
	}
}
