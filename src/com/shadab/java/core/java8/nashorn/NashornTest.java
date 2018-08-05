package com.shadab.java.core.java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*https://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/
	The Nashorn Javascript Engine is part of Java SE 8 and competes with other standalone engines 
	like Google V8 (the engine that powers Google Chrome and Node.js). 
	Nashorn extends Javas capabilities by running dynamic javascript code natively on the JVM.
	
	*
	*The Nashorn javascript engine can either be used programmatically from java programs 
	*or by utilizing the command line tool jjs, which is located in $JAVA_HOME/bin.
	* If you plan to work with jjs you might want to put a symbolic link for simple access:
	*/

public class NashornTest {

	public NashornTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws ScriptException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('Hello World!');");
	}

}
