package sample;

public class PerfectNumber {
	public static void main(String[]args) {
		int n=6;
		int sum=0 ;
		int i;
		for(i=1;i<n;i++)
		{ 
		  if(n%i==0) 
		  {
			sum=sum+i;
		  }
		}
		 System.out.println(sum);
				
		if(sum==n) {
			System.out.println("Perfect Number");
		}
		
	}

}
