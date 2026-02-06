package com.flm.abstraction2;

public class D implements B,C{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum() {       // as we have same unimplemented methods in interface 
		                     // B,C JVM wont confuse no ambiguity it will override only once instance of sum method  
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	

}
