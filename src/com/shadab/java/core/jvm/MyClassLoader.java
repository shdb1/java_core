package com.shadab.java.core.jvm;

public class MyClassLoader extends ClassLoader {
    public MyClassLoader() {
        super(MyClassLoader.class.getClassLoader());
    }
    public void findMyClass(String className) {
        Class c=findLoadedClass(className);
        if(c==null) {
            System.out.println(className + " is not loaded");
        } else {
            System.out.println(className + " is already loaded");
        }   
    }
} 