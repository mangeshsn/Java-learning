package com.core.constructorchaining;

public class Run {
	public static void main(String args[]) {
		Three three = new Three();
		// As memory is allocated to three the super method is called implicitly
		// and First base class is called here inheritance is from
		// One->Two->Three
		// so first three will invoke the constructor of two and then two will
		// invoke one. 
		// this is constructor chaining.
	}
}
