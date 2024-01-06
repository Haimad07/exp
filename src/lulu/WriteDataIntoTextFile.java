package lulu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException  {
		
		FileWriter fw = new FileWriter("C:\\Users\\user4\\Desktop\\ahmed1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("My name is ahmed\n");
		bw.write("Thanks");
		bw.write("My name is ahmed");
		bw.write("Thanks");
		bw.write("My name is ahmed");
		bw.write("Thanks");
		bw.close();
		
		System.out.println("Finished");
	}

}
