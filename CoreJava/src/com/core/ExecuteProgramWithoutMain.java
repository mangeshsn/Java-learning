package com.core;

/**Only before 1.7 
 * Can we execute a program without main() method?
 * 
 * Ans) Yes, one of the way is static block but in previous version of JDK not
 * in JDK 1.7.
 *
 */
public class ExecuteProgramWithoutMain {
	static {
		System.out.println("static block is invoked");
		System.exit(0);
	}
}
