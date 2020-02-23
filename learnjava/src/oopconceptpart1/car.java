package oopconceptpart1;

public class car {
	
	// Class variable
	
		int model;
		int wheel;


	public static void main(String[] args) {
		
		
		        // new car--> this is the object of a car class and these objects are referred by 3 variables 
				// 'new' keyword is used to create a object
				// a,b,c--> These are called object reference variables
				
				car a = new car();
				car b = new car();
				car c = new car();
				
				
				// Initializing class variable with a, b and c   
				
				a.model = 2015;
				a.wheel = 4;
				
				b.model = 2014;
				b.wheel= 4;
				
				c.model= 2013;
				c.wheel= 4;
				
				System.out.println("before assigning the reference");
				
				System.out.println(a.model);
				System.out.println(a.wheel);
				
				System.out.println("after shifting the reference");
				
				a=b;
				b=c;
				c=a;
				
				a.model= 10;
				System.out.println(a.model);
				c.model=20;
				System.out.println(a.model);
				System.out.println(c.model);

	}

}
