package com.core.consturctor;

public class OverloadingConstructor {
	String name;
	String color;

	OverloadingConstructor() {
		name = "Tom";
		color = "gray";
		System.out.println("default!");
	}

	OverloadingConstructor(String name) {
		this.name = name;
		System.out.println("string param!");
	}

	OverloadingConstructor(String name, String color) {
		this.name = name;
		this.color = color;
		System.out.println("two string param!");
	}
	public static void main(String args[]){
		OverloadingConstructor one = new OverloadingConstructor();
		OverloadingConstructor two = new OverloadingConstructor("Miumiu");
		OverloadingConstructor three = new OverloadingConstructor("Kitty", "white");
	}
}
