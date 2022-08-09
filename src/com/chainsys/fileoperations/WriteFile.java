package com.chainsys.fileoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {

	public static void main(String[] args) throws IOException {

		  // 1. File Path
        Path path = Paths.get("names.txt");
        
        //2. File Content
        String fileContent = "Arun, Parthi, java";
         
        //3. Write Contents to a file
        Files.write(path, fileContent.getBytes());
         
        System.out.println("File contents written successfully");

	}

}
