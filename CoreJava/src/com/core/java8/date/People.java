package com.core.java8.date;

import java.time.LocalDate;

public class People {
	
	String name;
	LocalDate date;

	public People(String name, LocalDate date) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", date=" + date + "]";
	}

	
	
	
}
