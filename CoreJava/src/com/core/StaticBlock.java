package com.core;

/**
 * Java static block
 * 
 * Is used to initialize the static data member. It is executed before main
 * method at the time of classloading.
 *
 */
public class StaticBlock {
	{
		System.out.println("init block");
	}
	static {
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) {
		System.out.println("Hello main");
		StaticBlock sb = new StaticBlock();
	}
}
