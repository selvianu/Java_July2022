package com.chainsys.fileoperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WritingReadingToFile {

	public static void main(String[] args) throws IOException {
		writingToFile();
	readingFile();
	}

	public static void writingToFile() throws IOException {
		FileWriter myFile = new FileWriter("filecreation.txt");
	//	myFile.write("You are writing in text file using File io");
		//to empty file date
		myFile.write("");
		System.out.println("Successfully wrote in file");
		myFile.close();
	}

	public static void readingFile() throws IOException {
		File myFile = new File("filecreation.txt");
		Scanner myData = new Scanner(myFile);
		while (myData.hasNextLine()) {
			String line = myData.nextLine();
			System.out.println("Reading file : method1 : "+line);
		}

/*		FileReader myFile1 = new FileReader("filecreation.txt");
		int fileContent = myFile1.read();
		// no of characters in file
		System.out.println("Content in file : " + fileContent);
		if (fileContent > 0) {
			int read = myFile1.read();
			System.out.print("Reading from file : another way "+fileContent);
		}
*/
		myData.close();
	}

}
