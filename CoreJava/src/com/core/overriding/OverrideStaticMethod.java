package com.core.overriding;

/**
 * A static method in a subclass may hide another static one in a superclass,
 * and that’s called hiding.
 *
 */
public class OverrideStaticMethod extends Base {
	// @Override cannot be overridden it can hide same method in Base class but
	// cannot override
	public static void yoMan() {
		System.out.println("yo from static method!");

	}
}
