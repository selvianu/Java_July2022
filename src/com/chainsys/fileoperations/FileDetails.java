package com.chainsys.fileoperations;

import java.io.File;
import java.io.IOException;

public final class FileDetails {

	public static void main(String[] args) throws IOException {
		
		File file = new File("check.txt");
		
		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.canWrite());
			System.out.println(file.length());
		} else {
			System.out.println("file doesnt exist");
			if (file.createNewFile()) {
				System.out.println("New file created : " + file.getName());
			} else {
				System.out.println("Error");
			}

		}
	}

}
