package oopconceptpart1;

public class functionsinjava {
	
	// main method--> It is the starting point of execution
	// main method is void because it never returns a value

	public static void main(String[] args) {
		

		// creating an object inside the main method to call the below non static method
		// one object will be created here, 'obj' is the reference variable referring to this object
		
		functionsinjava obj = new functionsinjava();  //  after creating this object a copy of all non static method will be given to this object
		
		obj.test(); // here we are calling the non static method
		
		// to print the value of c
		
		int l = obj.bug();
		System.out.println(l);
		
		// to print the value of d
		
		int div = obj.division(30, 10);
		System.out.println(div);
				
		
	}
				
		// non static method
		
		// void--> does not return any value
		
		public void test(){                  // here the return type of test method is 'void' // no input & no output
			                        
			
			System.out.println("test method");
			
		}
		
		public int bug() {                  // here the return type of bug method is 'int' // no input & some output
		
		System.out.println("bug method");
		
		int a = 10;
		int b = 20;
		int c= a+b;
		
		return c;
		
		}
		
		public int division(int x, int y) {      // here the i/p is given inside the bracket
			                                      // x, y ---> input parameters or arguments
			
			System.out.println("divison method");
			
			int d=x/y;
			 return d;
			
		}
		
		

	}

