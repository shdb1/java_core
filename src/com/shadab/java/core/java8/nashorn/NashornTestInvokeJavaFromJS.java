package com.shadab.java.core.java8.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornTestInvokeJavaFromJS {

public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
	ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
	engine.eval(new FileReader("script.js"));

	Invocable invocable = (Invocable) engine;

	Object result = invocable.invokeFunction("testJava");
}

// if method is not public- it cant be recognized.

public static String callMeFromJS(Object object) {
	
    System.out.println(object.getClass());
    return "Hello I am return from java";

}
}
