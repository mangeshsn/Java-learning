package com.core.overriding;

/**
 * The overriding method must have same argument list.
 *
 */
public class SameArgumentList extends Base {

	@Override
	public void argumentlist(int a, int b) {
		System.out.println("Final:" + (a + b));
	}

	public static void main(String args[]) {
		SameArgumentList sal = new SameArgumentList();
		sal.argumentlist(10, 10);
	}
}
