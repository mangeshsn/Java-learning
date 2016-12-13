package com.core.keywords;

/**
 * The strictfp keyword is used to force the precision of floating point
 * calculations (float or double) in Java conform to IEEE’s 754 standard,
 * explicitly. Without using strictfp keyword, the floating point precision
 * depends on target platform’s hardware, i.e. CPU’s floating point processing
 * capability. In other words, using strictfp ensures result of floating point
 * computations is always same on all platforms.
 * 
 * The strictfp keyword can be applied for classes, interfaces and methods.
 * 
 * Rules
 * 
 * strictfp cannot be applied for constructors. If an interface or class is
 * declared with strictfp, then all methods and nested types within that
 * interface or class are implicitly strictfp. strictfp cannot be applied for
 * interface methods
 *
 */
strictfp class StrictfpExample {
	double num1 = 10e+102;
	double num2 = 6e+08;

	double calculate() {
		return num1 + num2;
	}
}
