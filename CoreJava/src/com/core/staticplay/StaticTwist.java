package com.core.staticplay;

public class StaticTwist {

	static int i = 10;
	static {
		m1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main method");

	}

	public static void m1() {
		System.out.println(j);
	}

	static {
		System.out.println("2nd static block");
	}
	static int j = 20;
}
