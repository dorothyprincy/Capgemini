package javaprogram;

import java.util.Scanner;

public class ArithmeticOperation {
	static int add(int a,int b) {
		return a+b;
	}
	static float sub(float c,float d) {
		return c-d;
		
	}
	static long mul(long e,long f) {
		return e*f;
		
	}
	static double div(double g,double h) {
		return g/h;
	}
	static void design() {
		for(int i=1; i<=30; i++) {
			System.out.print("*");
			}
		
	}
		static void java() {
			System.out.println("Enter your choice");
			System.out.println("0.Exit");
			System.out.println("1.Addition");
			System.out.println("2.Subraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Arithmetic Operation");{
	
		ArithmeticOperation.design();
		
		}
		System.out.println();
		
	  Scanner sc=new Scanner(System.in);  
	int i=1;
	while(i<=4) {
		
		ArithmeticOperation.java();
		System.out.println("Enter your choice:");
		
		
	int Arithimetic = sc.nextInt();
	
	switch(Arithimetic) {
	case 0:
		
		System.out.println("Exit");
		return;
		
	case 1:
		System.out.println("Addition");
		ArithmeticOperation.design();
		System.out.println();
		System.out.println("Enter Num 1:");
		int a=sc.nextInt();
		System.out.println("Enter Num 2:");
		int b=sc.nextInt();
		int s1=add(a,b);
		System.out.println("Total:"+s1);
		
		break;
	case 2:
		System.out.println("Subtraction");
		ArithmeticOperation.design();
		System.out.println();
		System.out.println("Enter Num 1:");
		float c=sc.nextFloat();
		System.out.println("Enter Num 2:");
		float d=sc.nextInt();
		float s2=sub(c,d);
		System.out.println("Total:"+s2);
		break;
	case 3:
		System.out.println("Multiplication");
		ArithmeticOperation.design();
		System.out.println();
		System.out.println("Enter Num 1:");
		long e=sc.nextLong();
		System.out.println("Enter Num 2:");
		long f=sc.nextLong();
		long s3 =mul(e,f);
		System.out.println("Total:"+s3);
		break;
	case 4:
		System.out.println("Division");
		ArithmeticOperation.design();
		System.out.println();
		System.out.println("Enter Num 1:");
		double g=sc.nextDouble();
		System.out.println("Enter Num 2:");
		double h=sc.nextDouble();
		double s4=div(g,h);
		System.out.println("Total:"+s4);
		break;
	
	}
		
	}
		
		
	}
}
	    		
	    
	    		
	    		
	
	


		
		
		
		
		
	


