package com.core;
/**
 * 
 * varargs is a helper syntax and it enables use of variable number of arguments in a method call. In method definition variable aruguments are indicated 
 * by elipsis (…) and is called as ‘variable arity method’ and ‘variable arity parameter’ in java language specification. 
 * While invoking the varargs method we can use any number of arguments of type specified 
 * and separated by comma.
 *
 */
public class VariableArguments {
	static int sum(int i, int... marks) {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}

	public static void main(String[] args) {

		//invoking with variable arguments
		System.out.println(sum(1, 2, 3, 4));

		//same invocation using an array
		int arr[] = {2,3,4,5,6,8,34};
		System.out.println(sum(1, arr));
	}
}
