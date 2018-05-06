package com.shadab.java.core.jvm;

import java.io.*;
import java.lang.instrument.*;
import java.security.*;

public class dumper
{
  //A java agent must have a premain method which acts as the entry-point
  public static void premain(String agentArgs, Instrumentation inst)
  {
    System.out.println("agent loaded");

    // Register our transformer
    inst.addTransformer(new transformer());    
  }
}

class transformer implements ClassFileTransformer
{
   // The transform method is called for each non-system class as they are being loaded  
   public byte[] transform(ClassLoader loader, String className, 
                           Class<?> classBeingRedefined, ProtectionDomain protectionDomain, 
                           byte[] classfileBuffer) throws IllegalClassFormatException
   {
     if (className != null)
     {
       // Skip all system classes
       if (!className.startsWith("java") && 
           !className.startsWith("sun") && 
           !className.startsWith("javax") && 
           !className.startsWith ("com") && 
           !className.startsWith("jdk") && 
           !className.startsWith("org"))
       {
         System.out.println("Dumping: " + className);

         // Replace all separator charactors
         String newName = className.replaceAll("/", "#") + ".class";

         try
         {
           FileOutputStream fos = new FileOutputStream(newName);
           fos.write(classfileBuffer);
           fos.close();
         }
         catch (Exception ex)
         {
           System.out.println("Exception while writing: " + newName);
         } 
       }
     }
     // We are not modifying the bytecode in anyway, so return it as-is
     return classfileBuffer;
   }
 }