package org.openknowledge.java.tutorial.jcf.harrypotter;

/**
 * 
 * An entity class representing a House of Hogwarts
 * 
 * Source : http://harrypotter.wikia.com/wiki/Hogwarts_Houses
 * 
 */
public class HogwartHouse {

	public HogwartHouse(String houseName) {
		this.houseName = houseName;
	}
	
	/**
	 * A {@link String} variable representing the name of the house
	 */
	private String houseName;

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
}