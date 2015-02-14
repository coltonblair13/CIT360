package org.openknowledge.java.tutorial.jcf.harrypotter;

/**
 * An entity class to respresent a person
 */

public class Person {
	
	public Person(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}