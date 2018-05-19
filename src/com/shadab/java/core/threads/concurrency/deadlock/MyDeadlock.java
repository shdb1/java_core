package com.shadab.java.core.threads.concurrency.deadlock;

public class MyDeadlock {

	String str1 = "Java";
	String str2 = "UNIX";

	Thread trd1 = new Thread("My Thread 1") {
		public void run() {
			while (true) {
				System.out.println("Thread : " + Thread.currentThread().getName() + " seeking the lock on resource 1");
				synchronized (str1) {
					System.out.println("Thread : " + Thread.currentThread().getName() + " got the lock on resource 1");
					System.out.println(
							"Thread : " + Thread.currentThread().getName() + " seeking the lock on resource 2");
					synchronized (str2) {
						System.out.println(
								"Thread : " + Thread.currentThread().getName() + " got the lock on resource 2");
						System.out.println(str1 + str2);
					}
					System.out.println("Thread : " + Thread.currentThread().getName() + " releasing the lock on resource 2");
				}
				System.out.println("Thread : " + Thread.currentThread().getName() + " releasing the lock on resource 1");
			}
		}
	};

	Thread trd2 = new Thread("My Thread 2") {
		public void run() {
			while (true) {
				System.out.println("Thread : " + Thread.currentThread().getName() + " seeking the lock on resource 2");
				synchronized (str2) {
					System.out.println("Thread : " + Thread.currentThread().getName() + " got the lock on resource 2");
					System.out.println(
							"Thread : " + Thread.currentThread().getName() + " seeking the lock on resource 1");
					synchronized (str1) {
						System.out.println(
								"Thread : " + Thread.currentThread().getName() + " got the lock on resource 1");
						System.out.println(str2 + str1);
					}
					System.out.println("Thread : " + Thread.currentThread().getName() + " releasing the lock on resource 1");

				}
				System.out.println("Thread : " + Thread.currentThread().getName() + " releasing the lock on resource 2");

			}
		}
	};

	public static void main(String a[]) {
		MyDeadlock mdl = new MyDeadlock();
		mdl.trd1.start();
		mdl.trd2.start();
	}
}