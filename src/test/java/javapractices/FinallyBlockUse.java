package javapractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyBlockUse {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Texting.txt");

		file.createNewFile();

		FileWriter fileWriter = new FileWriter(file);

	}

}

class FinallyUse {

	public void finallyUses() throws IOException,FileNotFoundException {
		File file;
		FileWriter fileWriter = null;

		try {
			file = new File("C:/Texting.txt");

			file.createNewFile();

			fileWriter = new FileWriter(file);

			fileWriter.write("Welcome to codedisha");
		} catch (IOException e) {

			System.out.println("File related operation failed");

		} finally {

			fileWriter.close();

		}
	}
}
