package com.threads.ex;

public class ExThread {

	public static void main(String[] args) {
		System.out.println(" In main");
		Child child1 = new Child("Child-0",8);
		Child child2 = new Child("Child-1",9);
		
//		Messenger messenger = new Messenger();
//		String threadName = Thread.currentThread().getName();
//		messenger.printMessage(threadName);
		
		
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(Thread.currentThread().getName() +"..." + i);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
