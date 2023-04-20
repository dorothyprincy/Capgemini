package samplejava;

public class Student1 {
	
	String fName;
	
	long phNum;
	
	static String schlName="KCG";
	
	void add() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		
		//classname refvar = new classname() //constructor
		
		//constructor--> same like method but it has no return type
		//add();  //-->call a method
		Student1 st= new Student1("Vinoth",7402361819L);
		
		/*
		 *  st.add(); System.out.println(st);
		 * System.out.println(st1);
		 */
		
	   System.out.println(st);
	   Student1 st1= new Student1("Kavin");
	   System.out.println(st1);

	}

	public Student1(String fName) {
		//super();
		this.fName = fName;
	    System.out.println("This keyword memory address:"+this);
	}

	public Student1(String fName, long phNum) {
		//super();
		this.fName = fName;
		this.phNum = phNum;
	    System.out.println("This keyword memory address:"+this);

		
	}

}
