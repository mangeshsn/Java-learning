package com.core;

/**
 * 	If you declare any variable as static, it is known static variable.
	The static variable can be used to refer the common property of all objects (that is -not unique for each object) e.g. company name of employees,college name of students etc.
	The static variable gets memory only once in class area at the time of class loading.
 *
 */
public class StaticVariable {
	int rollno;
	String name;
	static String college = "ITS";

	StaticVariable(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		StaticVariable s1 = new StaticVariable(111, "Karan");
		StaticVariable s2 = new StaticVariable(222, "Aryan");

		s1.display();
		s2.display();
	}
}
