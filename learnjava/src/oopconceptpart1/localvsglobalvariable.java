package oopconceptpart1;

public class localvsglobalvariable {
	
	// Global variables or class variables---> variables which is declared before the main method or just next to the class
   // scope of global variable is we can use the global variable through out the programme by creating an object
		
		String name = "tom";
		int age= 25;

	public static void main(String[] args) {
		
		
		int i = 10; // local variable of the main method
		System.out.println(i);
		
		localvsglobalvariable obj = new localvsglobalvariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
						

	}
	
	public void sum() {
		
		int i =15; // local variables of the 'sum' method
		int j=20;
		int age= 25;
		
	}

	}

