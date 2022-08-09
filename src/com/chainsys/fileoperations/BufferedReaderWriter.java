package com.chainsys.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) throws IOException {

		writingWithBufferWriter();
		/*FileReader myFile1 = new FileReader("filecreation.txt");

		BufferedReader bReader = new BufferedReader(myFile1);
		String readLine = bReader.readLine();
		System.out.println("Reading line from file : " + readLine);*/
	}

	public static void writingWithBufferWriter() throws IOException {
		FileWriter myFile = new FileWriter("filecreation.txt");
		// cannot pass the filename as string directly
//BufferedWriter bWriter=new BufferedWriter("names.txt");
		// so passing FileWriter object as writer object
		BufferedWriter bWriter = new BufferedWriter(myFile);
		bWriter.write("using buffered Writer");
		//bWriter.close();
// can give new line in buffered Writer
		//bWriter.newLine();
		//if not newLine, appends to the existing content
		bWriter.write("Using new line in BWriter");
		bWriter.flush();
		bWriter.close();
	}

}
