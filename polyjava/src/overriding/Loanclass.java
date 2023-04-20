package overriding;

import java.util.Scanner;

public class Loanclass {
	
	
		String getRateOfInterest() {
			return ("5");
		}
		String getRateOfLoanTenure() {
			return ("6 Years");
		}
	}
	class Homeloan extends Loanclass{
		String getRateOfInterest() {
			return ("7");
		}
		String getRateOfLoanTenure() {
			return ("8 Years");
		}
	}
	class Personalloan extends Loanclass{
		String getRateOfInterest() {
			return ("6");
		}
		String getRateOfLoanTenure() {
			return ("7 Years");
		}
	}	

	class Carloan extends Loanclass{
		String getRateOfInterest() {
			return ("8");
		}
		String getRateOfLoanTenure() {
			return ("4 Years");
		}	
	}	
	
	class poly{
				public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					String str=sc.next();
					Loanclass s;
					 if(sc.equals("Homeloan")){
						s=new Homeloan();
						System.out.println("Get HomeLoan Interest: "+s.getRateOfInterest());
						System.out.println("Get HomeLoan Tenure:"+s.getRateOfLoanTenure());
					}
					 else if (sc.equals("Personalloan")){
						 s=new Personalloan();
					    System.out.println("Get PersonalLoan Interest: "+s.getRateOfInterest());
						System.out.println("Get PersonalTenure:"+s.getRateOfLoanTenure());
					 }
					 else {	
						 s=new Carloan();	
						System.out.println("Get CarLoan Interest: "+s.getRateOfInterest());
						System.out.println("Get CarLoan Tenure:"+s.getRateOfLoanTenure());
					 }
					}
			 }

	


	 

