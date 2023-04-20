package sample;

public class Factorialsum {
	public static void main(String[]args) {
		int n=153;
		int sum=0;
		int r;
		while(n!=0) {
			 
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		System.out.println(sum);
		
	}
}


