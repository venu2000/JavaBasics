package com.flm.ThreadsD1;

public class MainClass {

	public static void main(String[] args) {

		
		MyThreads1 myT1 = new MyThreads1();
		//myT1.run(); // print o/p but run() wont create  thread so we use Start()
		
		myT1.start();  // it will create thread and Run o/p
		
	//	System.out.println("Name" + Thread.currentThread().getName());
		System.out.println("Main....."); // main will print 1st because Threads need 
		                               //some time to allocate memory by ThreadScheduler
		//so we cant predict that which will print 1st 
		
		
		
	

	}

}
