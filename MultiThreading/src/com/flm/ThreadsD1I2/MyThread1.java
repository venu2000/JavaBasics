package com.flm.ThreadsD1I2;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		
		Thread.currentThread().setName("Thread1>>>>>>>>>>>>>>>");
		System.out.println(Thread.currentThread().getName());
		for(int i =0;i<=10;i++) {
//			try {
//				Thread.sleep(2000);    // if we keep sleep here Thread1.. will delayed 
//				
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
			System.out.println("Thread1....");
		}
		
	}
	
	


}
