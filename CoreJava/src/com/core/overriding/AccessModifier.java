package com.core.overriding;

/**
 * This rule can be understood as follows: If the overridden method is has
 * default access, then the overriding one must be default, protected or public.
 * If the overridden method is protected, then the overriding one must be
 * protected or public. If the overridden method is public, then the overriding
 * one must be only public.
 *
 */
public class AccessModifier extends Base {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		super.hello();
	}

	// protected to public
	@Override
	public void hey() {
		// TODO Auto-generated method stub
		super.hey();
	}

	// default->public / default->protected
	// default can be changed to public/protected
	@Override
	protected void man() {
		// TODO Auto-generated method stub
		super.man();
		System.out.println("after super call!");
	}

	// public cannot be changed it can be from public->public
	@Override
	public void argumentlist(int a, int b) {
		// TODO Auto-generated method stub
		super.argumentlist(a, b);
	}

	
	public static void main(String args[]){
		AccessModifier am = new AccessModifier();
		am.man(); //first super class is called and then the calling function gets executed.
	}
}
