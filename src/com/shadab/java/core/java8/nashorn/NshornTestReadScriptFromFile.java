package com.shadab.java.core.java8.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NshornTestReadScriptFromFile {

	public NshornTestReadScriptFromFile() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("script.js"));

		Invocable invocable = (Invocable) engine;

		Object result = invocable.invokeFunction("fun1", "Mohammad Shadab");
		System.out.println(result);
		System.out.println(result.getClass());
		
		
		/*            **********************************************************************************
		                              *********************************                                     */
		
		invocable.invokeFunction("fun2", new Date());
 
		invocable.invokeFunction("fun2", LocalDateTime.now());
 
		invocable.invokeFunction("fun2", new Person());

	}

}
