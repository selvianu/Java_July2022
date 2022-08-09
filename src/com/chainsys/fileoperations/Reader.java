package com.chainsys.fileoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Reader {
	public static void main(String args[]) throws IOException {
		// 1. File Path
		Path path = Paths.get("employees.txt");

		// 2. File Content
		
		//String fileContent = "Naresh Kumar,nareshkumar,pass123,CSE\nSiva,siva,pass234,IT";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you details");
		String fileContent = s.next();

		// 3. Write Contents to a file
		byte[] bytes = fileContent.getBytes();
		Files.write(path, bytes);

		System.out.println("File contents written successfully");

		// read file
		byte[] readAllBytes = Files.readAllBytes(path);
		String content = new String(readAllBytes);
		System.out.println("TotalContents:" + content);

		System.out.println("Read file contents:");
		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			String[] split = line.split(",");
			System.out.println(split);
			String name = split[0];
			String username = split[1];
			String password = split[2];
			String department = split[3];

			System.out.println(
					"name=" + name + ",username=" + username + ",password=" + password + ",department=" + department);

		}
	}
}