package com.threads.runn;

class RunnerDemon implements Runnable{

	@Override
	public void run() {
		System.out.println("hello");
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() +"..." + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonDemo{
	public static void main(String[] args) {
		System.out.println("welcome");
		//create an object of Runner which has the task
		RunnerDemon runner = new RunnerDemon();
		//create a thread and pass the runner object which has the task
		Thread t1 = new Thread(runner, "Thread-1");
//		t1.setDaemon(true);
		t1.start();
		Thread t2 = new Thread(runner, "Thread-2");
		t2.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() +"..." + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Main completed");
		System.out.println("Goodbye");
		
	}
	
}
