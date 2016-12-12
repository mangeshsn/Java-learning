package com.core.overriding;

/**
 * Rule #1: Only inherited methods can be overridden. Because overriding happens
 * when a subclass re-implements a method inherited from a superclass, so only
 * inherited methods can be overridden, that’s straightforward. That means only
 * methods declared with the following access modifiers: public, protected and
 * default (in the same package) can be overridden. That also means private
 * methods cannot be overridden.
 *
 *private method cannot be overridden because it is not inherited
 *default, protected and public method can be overridden.
 */
public class BasicOverriding extends Base {

	@Override
	void man() {
		// TODO Auto-generated method stub
		super.man();
	}

	@Override
	protected void hey() {
		// TODO Auto-generated method stub
		super.hey();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("override hello!");
	}

	public static void main(String args[]) {
		BasicOverriding basic0 = new BasicOverriding();
		Base basic1 = new BasicOverriding();
		basic0.hello();
		basic1.hello();
	}
}
