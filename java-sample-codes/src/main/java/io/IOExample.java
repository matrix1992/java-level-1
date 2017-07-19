package com.tower.java.examples.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class IOExample {

	public void stdIO() {
		// reading
		InputStream input = new BufferedInputStream(System.in);
		
		// writing
		OutputStream output = new BufferedOutputStream(System.out);
	}
	
	public void fileIO() throws FileNotFoundException {
		// reading
		InputStream input = new BufferedInputStream(new FileInputStream("someFile.txt"));
		
		// writing
		OutputStream output = new BufferedOutputStream(new FileOutputStream("someFile.txt"));
	}
}
