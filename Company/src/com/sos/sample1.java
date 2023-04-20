package com.sos;

public class sample1 extends Sample {

	@Override
	public void data() {
		super.data();
		System.out.println("cute");
	}
	
	@Override
	public void car() {
		super.car();
	}
	public static void main(String[] args) {
		sample1 s = new sample1();
		s.data();
		s.car();
	}
}
