package oopconceptpart1;

public class methodoverloading {

	public static void main(String[] args) {
		
		
methodoverloading obj = new methodoverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		

	}
	
	// we can overload main method
	
	public static void main(int p) {
		
	}
	
	
	public static void main(int p, int h) {
		
	}
	
	// Method overloading----> when the method name is same with diffrent no: of arguments/ i/p parameters with difeerent data types within the same class
	
	// duplicate method---> same method name with same no: of arguments/parametrs with same data types are not allowed
	
	// we cannot create a method inside a method
	
	
	// method w/o any parameters
	
	public void sum() {  
		
		System.out.println("sum method zero parameter");
	}
	
	
	// method with 1 parameters
	
	public void sum(int i) {
		
		System.out.println("sum method with 1 para");
		System.out.println(i);
	}
	
	
	public void sum(int j, int k) {
		
		System.out.println("sum method with 2 para");
		System.out.println(j+k);
	}
	
	

	}

