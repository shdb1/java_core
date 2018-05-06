package com.shadab.java.core.jvm;

import java.util.*;

public class PermGenRemovalMetaSpaceAdditionTest {
	/*
	 * OutOfMemoryError might be thrown when one of the following circumstances occurs:

      JVM has run out of native memory.
       Java heap is out of memory.
         PermGen or Metaspace has run out of memory.
           JVM spent too much time trying to collect the garbage.
	 * 
	 * 
	 * If you upgrade from JDK 7 to JDK 8, there are some changes in JVM that you should pay 
	 * attention to.  One of them is:
		The removal of Permanent Generation (PermGen) space.[1]  
		Similar to the Oracle JRockit and IBM JVM's, the JDK 8 HotSpot JVM is now 
		using native memory for the representation of class metadata, which is called Metaspace.
		  This may have removed the old OOM Error.[2] But ...

		proper monitoring and tuning of the Metaspace is still required in order to limit 
		the frequency or delay of metaspace garbage collections.  In this article, we will show how to achieve that.

		***Tuning Metaspace

		When space (either PermGen or Metaspace) is filled up, class need to be unloaded.
		In the PermGen era, when PermGen is filled up, a Garbage Collection (or GC) would occur and 
		unload classes.  Without PermGen, we still need to have some way to know when to do a GC to 
		unload classes.  This is when
		-XX:MetaspaceSize=<size>

		comes into play.   When the amount of space used for classes reaching MetaspaceSize, a GC is done to see if there are classes to be unloaded.  If you know that you are going to have lots of classes loaded and use more than 20M (this is the default value for my platform) class data, increasing MetaspaceSize can delay the GC's that are done to check for class unloading.  During your upgrade from JDK 7 to 8, as a first estimate, you can use the old value of PermSize to be your new MetaspaceSize. 
*/
	
	/*Tool in JDK to see loeaded classes 
	 jps -l*/
	
	
    static javassist.ClassPool cp = javassist.ClassPool.getDefault();
    
public static void main(String args[]) throws Exception
    {
	
	// i hav eset met space -XX:MetaspaceSize=0.1M
	System.out.println("11");
        for (int i = 0; i < 1000000; i++) {
        	System.out.println();
            Class c = cp.makeClass("com.shadab.java.core.jvm.PermGenRemovalMetaSpaceAdditionTest" + i).toClass();
            System.out.println(c.getClass());
        }
    }
}
	
	

