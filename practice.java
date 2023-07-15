package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice {

	public static void main(String[] args) throws IOException {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file.");
			writer.write("\nWriting to a file.");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			System.out.println(reader.readLine());
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
