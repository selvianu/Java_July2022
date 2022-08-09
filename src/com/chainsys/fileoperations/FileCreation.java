package com.chainsys.fileoperations;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File file = new File("filecreation.txt");
		//Folder created
		File file1 = new File("E:\\eclipse-workspace\\JavaTraining_July\\file_folder");
		boolean exists = file1.exists();
		System.out.println("Directory exists : "+exists);// false, then create the directory
		if (exists == false) {
			boolean dir = file1.mkdir();
			System.out.println("Directory created : "+dir);
		}

// creating new file
		if (file.createNewFile()) {
			System.out.println("New file created : " + file.getName());
		} else {
			System.out.println("file already exists");
		}

	}

}
