package com.core.string;

public class StringConcatenation {
	public static void main(String args[]) {
		String s = "Sachin" + " Tendulkar";
		System.out.println(s);// Sachin Tendulkar

		// The Java compiler transforms above code to this:

		// String s=(new StringBuilder()).append("Sachin").append("
		// Tendulkar).toString();

		String sn = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(sn);// 80Sachin4040

		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);// Sachin Tendulkar
	}
}
