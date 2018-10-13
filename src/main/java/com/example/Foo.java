package com.example;

import java.util.Objects;

/**
 * @author Thomás Sousa Silva (ThomasSousa96)
 * @see
 */
public class Foo {

	private String name;
	private String lastName;

	/**
	 * Constructs a new instance of Foo.
	 *
	 * @param
	 * @param lastName
	 */
	public Foo(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		return ((obj instanceof Foo) && Objects.equals(name, ((Foo) obj).name));
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

}
