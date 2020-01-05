package com.shadab.java.core.challenges.threads.playaround;

public class PlayThreadLocal {
	
	public static void main(String[] args) {
		ThreadLocalThread thread = new ThreadLocalThread();
		Thread thread1 = new Thread(thread);
		Thread thread2 = new Thread(thread);
		thread1.start();
		thread2.start();
		
	}

}


class ThreadLocalThread extends Thread{
	
	  ThreadLocal myThreadLocal = new ThreadLocal();
	  myThreadLocal.set("A thread local value");
	  Integer data=0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (data) {
		while(data<10){
	
				System.out.println("Thread nane is"+Thread.currentThread().getName()+"data is :"+data);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//	System.out.println("Thread nane is"+Thread.currentThread().getName()+"wokeup");
				data++;
			}
	
		}
	
	}
	
	
}