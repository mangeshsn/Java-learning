package com.core.string;

/**
 * You can get substring from the given string object by one of the two methods:
 * 
 * public String substring(int startIndex): This method returns new String
 * object containing the substring of the given string from specified startIndex
 * (inclusive). public String substring(int startIndex, int endIndex): This
 * method returns new String object containing the substring of the given string
 * from specified startIndex to endIndex. In case of string:
 * 
 * startIndex: inclusive endIndex: exclusive
 *
 */
public class SubString {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s.substring(0, 2));// he

		// In the above substring, 0 points to h but 2 points to e (because end
		// index is exclusive).

		String s1 = "SachinTendulkar";
		System.out.println(s1.substring(6));// Tendulkar
		System.out.println(s1.substring(0, 6));// Sachin
	}
}
