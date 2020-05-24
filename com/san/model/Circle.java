package com.san.model;

import com.san.aspect.Logging;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	@Logging
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter method of circle");
	}
}
