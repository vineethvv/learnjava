package oopconceptpart1;

public class callbyvalueandcallbyref {
	
	// Creating variable p & q of type int
	
	int p;
	int q;

		public static void main(String[] args) {
			
			callbyvalueandcallbyref obj = new callbyvalueandcallbyref();
			
			int x= 10;
			int y= 20;
			
			obj.test(x, y); // Call by value or pass by value
			
			
			// assigning values to the global non static variables
			
			obj.p = 50;
			obj.q = 60;
			
			obj.swap(obj);
			
			// after swap
			
			System.out.println(obj.p);
			System.out.println(obj.q);
					
			
		}
		
		
		public int test(int a, int b) {  // here the copy of x & y is given to a & b 
			
			a = 30; // here we are changing the value of a & b ( this will not affect the original value assigned in x & y in the main method )
			b= 40;
			
			int c= a+b;
			
			return c;
			
			
		}
		
		// call by reference ---> here we are passing the value of object reference
		
		
		public void swap(callbyvalueandcallbyref t) {  // It means that iam passing the reference variable of this 'callbyvalueandcallbyref' class
			                                           
			                                            // t ---> reference variable
			
			                                            // Now the value of obj is given to t
			
			int temp;
			temp = t.p; // now the value of temp = 50
			t.p = t.q; // now the value of t.p = 60
			t.q = temp; // now the value of t.q = 50
			
			
			
			
		

	}

}
