package com.shadab.java.core.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.shadab.java.core.io.serialization.Person;

public class WriteToFileExample1 {

	private static final String FILENAME = "C:\\Users\\mshadab\\Desktop\\MyData\\filename.txt";

	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			Person p1 = new Person("John", 30, "Male");
			Person p2 = new Person("Rachel", 25, "Female");
			String content = "This is the content to write into file\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(p1.toString());

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}