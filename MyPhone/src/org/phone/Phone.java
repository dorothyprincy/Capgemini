package org.phone;

public class Phone {
	public void phoneInfo(float ram) {
		System.out.println(ram);
		
	}
	public void phoneInfo1(int upi) {
		System.out.println(upi);
		
	}
	
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo(84.06f);
		p.phoneInfo1(678954890);
	}

}
