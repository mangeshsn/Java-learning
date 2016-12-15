package com.core.constructorthisandsuper;

/**
 * using this and super in constructor.
 * this or super should be first line in constructor.
 *
 */
public class Sub extends Super{

	Sub(int x) {
		super(x);
		System.out.println("in sub x!");
		
	}
	Sub(int x,int y){
		this(x);
		System.out.println("in sub x,y!");
	}
	public static void main(String arg[]){
		Sub s = new Sub(1,1);
	}
}
