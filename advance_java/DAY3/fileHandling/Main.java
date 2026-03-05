package advance_java.DAY3.fileHandling;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// It won't create physical file , it just pointing to that path
		
		File file = new File("src/test.java");
		System.out.println("File Object created");
		
		if(file.createNewFile()) {
			System.out.println("File created");
		} else {
			System.out.println("File already exists");
		}
		
		
		// Writing 
		
		FileWriter writer = new FileWriter("src/test.java" , true);
		writer.write("Hello there...");
		writer.write("Hii");
		writer.close();
		System.out.println("Completed");
		
		
		
	}

}

// File - represents a file or folder
// FileWriter - write text to file
// FileReader = read text from file
// BufferedReader - fast reading



