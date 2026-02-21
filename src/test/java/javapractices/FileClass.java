package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("src/test/resources/test.txt");
		// file.createNewFile();
		// file.delete();

		// FileWriter fileWriter = new FileWriter(file);
//		fileWriter.write("Welcome to codedisha \n pune");
//		fileWriter.close();

		FileReader fileReader = new FileReader(file);

		int ch;
		while ((ch = fileReader.read()) != -1) {
			System.out.print((char) ch);
		}

		fileReader.close();
		System.out.println();
		System.out.println(file.length());
		System.out.println(file.canRead());

		System.out.println(file.exists());

		System.out.println(file.getName());

		System.out.println(file.getPath());

		System.out.println(file.getTotalSpace());

		System.out.println(file.isFile());

	}

}
