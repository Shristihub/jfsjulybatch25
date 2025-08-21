package com.threads.ex;

public class Child extends Thread{
	
	
	Child(String name,int priority){
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		start();
	}
	

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		Messenger messenger = new Messenger();
		messenger.printMessage(name);
		
			
		}
		
	}



