package com.core;

/**
 * If you apply static keyword with any method, it is known as static method.
 * 
 * A static method belongs to the class rather than object of a class. A static
 * method can be invoked without the need for creating an instance of a class.
 * static method can access static data member and can change the value of it.
 * 
 * Restrictions for static method
 * 
 * There are two main restrictions for the static method. They are: The static
 * method can not use non static data member or call non-static method directly.
 * this and super cannot be used in static context.
 */
public class StaticMethod {
	int rollno;
	String name;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	StaticMethod(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		StaticMethod.change();

		StaticMethod s1 = new StaticMethod(111, "Karan");
		StaticMethod s2 = new StaticMethod(222, "Aryan");
		StaticMethod s3 = new StaticMethod(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();
	}
}
