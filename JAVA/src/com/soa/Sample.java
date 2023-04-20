package com.soa;

public class Sample  extends Company{
	
	
	
@Override
	public void car() {
		// TODO Auto-generated method stub
		super.car();
	}

@Override
	public void bike() {
		super.bike();
	}
	
	private void dat() {
System.out.println("done");
	}
	
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.bike();
		s.car();
		s.dat();
	}
}
