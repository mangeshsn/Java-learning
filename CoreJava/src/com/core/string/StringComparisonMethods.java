package com.core.string;

public class StringComparisonMethods {
	// There are three ways to compare string in java:

	// By equals() method
	// By = = operator
	// By compareTo() method
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		String s5 = "SACHIN";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		System.out.println(s1.equals(s5));// false
		System.out.println(s1.equalsIgnoreCase(s5));// true

		System.out.println(s1 == s2);// true (because both refer to same
										// instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance
										// created in nonpool)

		// String compare by compareTo() method

		// The String compareTo() method compares values lexicographically and
		// returns an integer value that describes if first string is less than,
		// equal to or greater than second string.

		s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}
}
