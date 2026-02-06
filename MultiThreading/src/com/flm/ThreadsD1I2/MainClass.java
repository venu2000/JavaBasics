package com.flm.ThreadsD1I2;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread1 myT1 = new MyThread1();
		MyThread2 myT2 = new MyThread2();
		
		//dynamic method dispatch
		//     as we are using interface of runnable start() will not be in runnable so 
 		Runnable myT3 = new MyThread3();
		//Thread.sleep(2000);  we can also keep sleep here 
		myT1.start();
		myT2.start();
		
	
		
		//we are creating thread Obj for Runnable refernce, to get start();
		Thread t3 = new Thread(myT3);
		t3.start();
		
		print();        // sleep will delay this print methods, 
         //before printing printmethod t1&t2 will print parallally
	
		
	}
	
	static void print() throws InterruptedException {
		for(int i = 0;i<10;i++){
			Thread.sleep(1000);   // it will get sleep for 1 sec and allows other threads to print 
			System.out.println("Main............");
		
	}
	}
}
