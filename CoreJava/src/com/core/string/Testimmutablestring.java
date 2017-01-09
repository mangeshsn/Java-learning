package com.core.string;

class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable
								// objects

		// explicit assigning

		s = s.concat(" Tendulkar");
		System.out.println(s);

		// Why string objects are immutable in java?

		// Because java uses the concept of string literal.Suppose there are 5
		// reference variables,all refers to one object "sachin".If one
		// reference variable changes the value of the object, it will be
		// affected to all the reference variables. That is why string objects
		// are immutable in java.

	}
}
