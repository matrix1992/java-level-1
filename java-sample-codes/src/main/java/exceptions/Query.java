package com.tower.java.examples.exceptions;

public class Query {

	// try catch finally return problem
	// check user exists, validate, validate, insert, insert or validate, insert, validate, insert
	
	public int first() {
		try {
			throw new NullPointerException();
			return 0;
		} catch (Exception e) {
			// do something
			return 1;
		} finally {
			return 2;
		}
		return 3;
	}
	
	public void insertUserAndAddress(String user, String address) {
		// Option 1:
		// check if user already exists
		// validate user
		// validate address
		// insert user
		// insert address
		
		// option 2:
		// check if user already exists
		// validate user
		// insert user
		// validate address
		// insert address
	}
}
