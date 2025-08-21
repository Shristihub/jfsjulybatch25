package com.threads.runn;

class Runner implements Runnable{

	@Override
	public void run() {
		System.out.println("hello");
	}
	

}

public class RunThread{
	public static void main(String[] args) {
		System.out.println("welcome");
		//create an object of Runner which has the task
		Runner runner = new Runner();
		//create a thread and pass the runner object which has the task
		Thread t1 = new Thread(runner, "Thread-1");
		t1.start();
		System.out.println(t1);
	}
	
}
