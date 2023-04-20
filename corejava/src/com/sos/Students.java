package com.sos;

public class Students{
	String studentname;
	String dob;
	long phonenumber;
	int passedout;
	
	static String clgname="DSCET";
	static int pincode=603112;
	static String department="CSE";
	static String city="Chennai";
	public static void main(String[] args) {
	System.out.println(Students.clgname);
	System.out.println(Students.pincode);
	System.out.println(Students.department);
	System.out.println(Students.city);
	Students st=new Students("priya");
	Students st1=new Students("dorothy","15.07.2000");
	Students st2=new Students("siva","15.5.2002",6381345609L);
	Students st3=new Students("geetha","04.09.1999",9876342100L,2023);
	
	
	
	}
	
	public Students(String studentname) {
		super();
		this.studentname = studentname;
		System.out.println(this);
		
	}
	 
	
    public  Students(String studentname,String dob) {
		super();
		this.studentname=studentname;
		this.dob = dob;
		System.out.println(this);
		
	}

	public Students(String studentname, String dob, long phonenumber) {
		super();
		this.studentname = studentname;
		this.dob = dob;
		this.phonenumber = phonenumber;
		System.out.println(this);
	}
	

	public Students(String studentname, String dob, long phonenumber, int passedout) {
		super();
		this.studentname = studentname;
		this.dob = dob;
		this.phonenumber = phonenumber;
		this.passedout = passedout;
		
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Students [studentname=" + studentname + ", dob=" + dob + ", phonenumber=" + phonenumber + ", passedout="
				+ passedout + "]";
	}
	
}
		
	
	
	
	
	


