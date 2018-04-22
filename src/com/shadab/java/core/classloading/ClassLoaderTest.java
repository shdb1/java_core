package com.shadab.java.core.classloading;

public class ClassLoaderTest extends MyClassLoader {

	public static void main(String[] args) {

		MyClassLoader javaClassLoader = new MyClassLoader();
		javaClassLoader.invokeClassMethod("com.shadab.java.core.classloading.MyClass", "sayHello");
		
	}
	
}