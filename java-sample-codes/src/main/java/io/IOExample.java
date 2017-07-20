package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class IOExample {

	public void stdIO() throws IOException {
		// reading
		InputStream input = new BufferedInputStream(System.in);
		
		// writing
		OutputStream output = new BufferedOutputStream(System.out);
		
		// read bytes
		int i = 0;
		while (i != -1) {
			i = input.read();
			System.out.print(i);
		}
		
		// write bytes 
		String str = "this is a string";
		byte[] bytes = str.getBytes();
		output.write(bytes, 0, bytes.length);
	}
	
	public void fileIO() throws FileNotFoundException {
		// reading
		InputStream input = new BufferedInputStream(new FileInputStream("someFile.txt"));
		
		// writing
		OutputStream output = new BufferedOutputStream(new FileOutputStream("someFile.txt"));
	}
}
