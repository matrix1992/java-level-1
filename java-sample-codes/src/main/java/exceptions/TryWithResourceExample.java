package com.tower.java.examples.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceExample {

	// ensures that what ever the reason may be
	// the resource must be closed.
	public void openFile() throws IOException {
		try (FileInputStream reader = new FileInputStream("someFile")) {
			int i = 0;
			while (i != -1) {
				i = reader.read();
				System.out.println(i);
			}
			System.out.println("finished reading");
		}
	}
}
