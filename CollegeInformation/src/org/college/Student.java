package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("dorothy");
		
	}
	public void studentDept() {
		System.out.println("cse");
		
	}
	public void studentId() {
		System.out.println("15");
		
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
		
	}
 
}
