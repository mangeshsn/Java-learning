package com.core;

/**
 * The assert keyword is used in assert statement which is a feature of the Java
 * programming language since Java 1.4. Assertion enables developers to test
 * assumptions in their programs as a way to defect and fix bugs.
 */
public class AssertionExample {
	 public static void main(String[] args) {
	        int argCount = args.length;
	        assert argCount == 10 : "The number of arguments must be 5";
	        System.out.println("OK");
	    }
}