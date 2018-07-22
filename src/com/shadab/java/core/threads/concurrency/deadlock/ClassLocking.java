package com.shadab.java.core.threads.concurrency.deadlock;

public class ClassLocking {

	Runnable task1= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Task-1");
			synchronized (String.class) {
				while(true)
				System.out.println("got the lock on String by thread-1");
			}
			
		}
	};
	
	Runnable task2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Task-2");
			synchronized (String.class) {
				while(true)
				System.out.println("got the lock on String by thread-2");
				
			}
			
		}
	};
	
	public static void main(String[] args) {
		ClassLocking classLocking = new ClassLocking();
		Thread thread1= new Thread(classLocking.task1);
		Thread thread2 = new Thread(classLocking.task2);
		thread1.start();
		thread2.start();
	/*	since i am lockeing the whole string class- either thread 1 or 2 
		just keep on executing since other thread not able to get lock on string class*/
		System.out.println("since i am lockeing the whole string class- either thread 1 or 2 just keep on executing since other thread not able to get lock on string class");
	}
	

}

class MyTaskOne implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
