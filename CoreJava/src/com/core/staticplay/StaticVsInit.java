package com.core.staticplay;

public class StaticVsInit {
	//StaticTwist st = new StaticTwist();
	{
		System.out.println("first init");
		int x = 10;
	}
	static{
		System.out.println("first static");
		StaticVsInit svi = new StaticVsInit();
	}
	public static void main(String[] args) {
		//StaticVsInit svi = new StaticVsInit();
	}
	{
		System.out.println("second init");
		System.out.println(x);
	}
	static int x = 12;
	static{
		System.out.println(x);
		System.out.println("second static");
	}
}
