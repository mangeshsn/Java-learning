package com.core.keywords;

/**
 * Final Class When a class is marked as final, it cannot be subclassed. In
 * other words, if we don’t want a class to be able to be extended by another
 * class, mark it as final.
 * 
 * Final Method: When a method is marked as final, it cannot be overridden.
 * 
 * 
 * Final Variable: When a variable is marked as final, it becomes a constant -
 * meaning that the value it contains cannot be changed after declaration
 * 
 * 
 * For reference variable: 1. final Cat myCat = new Cat(); After this
 * declaration, myCat cannot point to another object.
 * 
 * In Java, constants are always declared with the static and final modifiers,
 * for example: 1 static final float PI = 3.1415f;
 * 
 * The final modifier can be also used in method’s arguments. For example: 
 * void feed(final Cat theCat) { }
 */

final public class FinalExample {

}
// this cannot be done it throws error.
// public class Ext extends FinalExample{}
