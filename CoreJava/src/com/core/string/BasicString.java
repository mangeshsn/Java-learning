package com.core.string;

/**
 * Each time you create a string literal, the JVM checks the string constant
 * pool first. If the string already exists in the pool, a reference to the
 * pooled instance is returned. If string doesn't exist in the pool, a new
 * string instance is created and placed in the pool
 *
 */
public class BasicString {
	// String literal
	String literal = "hello world!";
	String literal1 = "hello world!"; // it will not create new instance will
										// point to same in String constant pool
	// case 2
	String s = new String("Welcome");// creates two objects and one reference
										// variable

	/*
	 * case 2: In such case, JVM will create a new string object in normal(non
	 * pool) heap memory and the literal "Welcome" will be placed in the string
	 * constant pool. The variable s will refer to the object in heap(non pool).
	 */

	public static void main(String[] args) {
		String s1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
