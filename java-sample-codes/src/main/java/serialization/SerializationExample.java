package com.tower.java.examples.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {

	private void showSerializationExample() throws Exception {
		Person savePerson = new Person("blank", -1);
		savePerson(savePerson);
		
		Person readPerson = readPerson();
		System.out.println(readPerson.toString());
	}
	
	private void savePerson(Person person) throws Exception {
		ObjectOutputStream objectOutputStream =
	            new ObjectOutputStream(new FileOutputStream("data/person.bin"));

	    objectOutputStream.writeObject(person);
	    objectOutputStream.close();
	}
	
	private Person readPerson() throws Exception {
		ObjectInputStream objectInputStream =
	            new ObjectInputStream(new FileInputStream("data/person.bin"));
	    Person personRead = (Person) objectInputStream.readObject();
	    objectInputStream.close();
	        
	    return personRead;
	}
	
	public static void main(String[] args) throws Exception {
		new SerializationExample().showSerializationExample();
	}
	
	private static class Person implements Serializable { // guess the numbers of methods in this interface
		private static final long serialVersionUID = 1234L;
		
	    private String name = null;
	    private int    age  =   0;
	    
	    public Person(String name, int age) {
	    	this.name = name;
	    	this.age = age;
	    }
	    
	    public String toString() {
	    	return name + "\n" + age;
	    }
	}
}
