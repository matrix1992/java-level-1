package com.tower.java.examples.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExample {

	// catching exception
	public void openFile() {
		FileReader reader = null;
		try {
			reader = new FileReader("someFile");
			int i = 0;
			while (i != -1) {
				i = reader.read();
				System.out.println(i);
			}
			reader.close();
			System.out.println("finished reading");
		} catch (FileNotFoundException ex) {
			// file not found
		} catch (IOException ex) {
			// some other problem while trying to read the file
		} finally {
			try {
				reader.close();
			} catch (Exception ex) {
				// do nothing
			}
		}
	}

	public void readFile(String fileName) {
		FileReader reader = null;
		try {
			reader = getFileReader(fileName);
			int i = 0;
			while (i != -1) {
				i = reader.read();
				System.out.println(i);
			}
			reader.close();
			System.out.println("finished reading");
		} catch (IOException ex) {
			// do something about this exception
		} finally {
			try {
				reader.close();
			} catch (Exception ex) {
				// do nothing
			}
		}
	}
	
	// propagating exception
	public FileReader getFileReader(String fileName) throws FileNotFoundException {
		return new FileReader("someFile");
	}
}
