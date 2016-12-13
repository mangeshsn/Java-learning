package com.core.keywords;

/**
 * The native keyword is used to declare a method which is implemented in
 * platform-dependent code such as C or C++. When a method is marked as native,
 * it cannot have a body and must ends with a semicolon instead. The Java Native
 * Interface (JNI)specification governs rules and guidelines for implementing
 * native methods, such as data type conversion between Java and the native
 * application.
 *
 */
public class NativeExample {
	public native void fastCopyFile(String sourceFile, String destFile);
}
