package com.shadab.java.core.challenges.threads.playaround;


public class TestThreadData {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
	Thread threadObject = new Thread(thread);
	threadObject.start();
	
	Thread threadObject1= new Thread(thread);
	threadObject1.start();
			
	}

}


class MyThread implements Runnable{

	static Integer data = 0;
	
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