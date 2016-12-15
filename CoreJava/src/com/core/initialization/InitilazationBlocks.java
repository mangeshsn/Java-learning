package com.core.initialization;

public class InitilazationBlocks {
	//gets executed everytime object is created.
	{
		System.out.println("Instance Init Block!");
	}
	// end instance initialization block
	static {
		System.out.println("static block 1");
	}
	public InitilazationBlocks() {
		System.out.println("constructor!");
	}
	// static block is executed only once
	static {
		System.out.println("Static block!");
	}

	public static void main(String[] args) {
		InitilazationBlocks in = new InitilazationBlocks();
		InitilazationBlocks in2 = new InitilazationBlocks();
		
	}
}
