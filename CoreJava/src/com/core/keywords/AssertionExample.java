package com.core.keywords;

import java.util.Scanner;

/**
 * keyword: assert
 * 
 * The assert keyword is used in assert statement which is a feature of the Java
 * programming language since Java 1.4. Assertion enables developers to test
 * assumptions in their programs as a way to defect and fix bugs.
 * 
 * 
 * If you use assertion, It will not run simply because assertion is disabled by
 * default. To enable the assertion, -ea or -enableassertions switch of java
 * must be used.
 *
 *
 * Output* Enter ur age 11 Exception in thread "main" java.lang.AssertionError:
 * Not valid at
 * 
 */
class AssertionExample {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ur age ");

		int value = scanner.nextInt();
		assert value >= 18 : " Not valid";

		System.out.println("value is " + value);
	}
}