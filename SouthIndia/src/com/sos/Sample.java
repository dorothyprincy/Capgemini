package com.sos;

public class Sample {
	

	
public Sample() {
this (50);

}

public Sample(int age) {
	this (true);
	System.out.println(age);
	
}

public Sample (boolean working) {
	this (56.78f);
	System.out.println(working);
}

public Sample (float petrol) {
	System.out.println(petrol);
}


public static void main(String[] args) {
	Sample s = new Sample();
}

}
