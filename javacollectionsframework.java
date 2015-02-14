package org.openknowledge.java.tutorial.jcf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openknowledge.java.tutorial.jcf.harrypotter.Book;
import org.openknowledge.java.tutorial.jcf.harrypotter.HogwartHouse;
import org.openknowledge.java.tutorial.jcf.harrypotter.Person;

public class JavaCollectionsFramework {

	final static Book PHILOSPHER_S_STONE = new Book("Philosopher's Stone");
	final static Book CHAMBER_OF_SECRETS = new Book("Chamber of Secrets");
	final static Book GOBLET_OF_FIRE = new Book("Goblet of Fire");
	final static Book PRISONER_OF_AZKABAN = new Book("Prisoner of Azkaban");

	final static Person GODRIC_GRYFFINDOR = new Person("Godric Gryffindor");
	final static Person HELEGA_HUFFLEPUFF = new Person("Helga Hufflepuff");
	final static Person ROWENA_RAVENCLAW = new Person("Rowena Ravenclaw");
	final static Person SALAZAR_SLYTHERIN = new Person("Salazar Slytherin");

	final static HogwartHouse GRYFFINDOR = new HogwartHouse("Gryffindor");
	final static HogwartHouse HUFFLEPUFF = new HogwartHouse("Hufflepuff");
	final static HogwartHouse RAVENCLAW = new HogwartHouse("Ravenclaw");
	final static HogwartHouse SLYTHERIN = new HogwartHouse("Slytherin");
	
	/**
	 * A List of Books [Ordered Sequence]
	 */
	private static List<Book> bookList;

	/**
	 * A set of persons [Non duplicate collection of founders of Hogwarts]
	 */
	private static Set<Person> founders;

	/**
	 * A map data structure to connect a person to a Hogwart House
	 */
	private static Map<Person, HogwartHouse> houseFounderMapping;

	public static void main(String[] args) {

		System.out.println("\nList of Books:\n");

		for (Book book : getBookList()) {
			System.out.println(book.getBookName());
		}

		System.out.println("\nSet of Founders:\n");
		for (Person founder : getFounders()) {
			System.out.println(founder.getName());
		}

		System.out.println("\nMap of Houses:\n");
		for (Person founder : getHouseFounderMapping().keySet()) {
			HogwartHouse hogwartHouse = getHouseFounderMapping().get(founder);
			System.out.println(founder.getName() + " : " + hogwartHouse.getHouseName());
		}

	}

	static {
		bookList = new LinkedList<Book>();
		bookList.add(PHILOSPHER_S_STONE);
		bookList.add(CHAMBER_OF_SECRETS);
		bookList.add(PRISONER_OF_AZKABAN);
		bookList.add(GOBLET_OF_FIRE);

	}

	static {

		founders = new HashSet<Person>();
		founders.add(GODRIC_GRYFFINDOR);
		founders.add(HELEGA_HUFFLEPUFF);
		founders.add(ROWENA_RAVENCLAW);
		founders.add(SALAZAR_SLYTHERIN);

	}
	
	static {
		houseFounderMapping = new HashMap<Person, HogwartHouse>();
		houseFounderMapping.put(GODRIC_GRYFFINDOR, GRYFFINDOR);
		houseFounderMapping.put(HELEGA_HUFFLEPUFF, HUFFLEPUFF);
		houseFounderMapping.put(ROWENA_RAVENCLAW, RAVENCLAW);
		houseFounderMapping.put(SALAZAR_SLYTHERIN, SLYTHERIN);
	}

	public static List<Book> getBookList() {
		return bookList;
	}

	public static void setBookList(List<Book> bookList) {
		JavaCollectionsFramework.bookList = bookList;
	}

	public static Set<Person> getFounders() {
		return founders;
	}

	public static void setFounders(Set<Person> founders) {
		JavaCollectionsFramework.founders = founders;
	}

	public static Map<Person, HogwartHouse> getHouseFounderMapping() {
		return houseFounderMapping;
	}

	public static void setHouseFounderMapping(
			Map<Person, HogwartHouse> houseFounderMapping) {
		JavaCollectionsFramework.houseFounderMapping = houseFounderMapping;
	}
}