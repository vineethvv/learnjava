package oopconceptpart1;

public class staticandnonstatic {
	
	String name = "tom";  // non static global variable
	static int age = 25;  // static global variable

	public static void main(String[] args) {
	
		//two Ways to call static method as below:
		
				//1. By direct calling
				
				sum();
				
				//2. calling by class name
				
				staticandnonstatic.sum();
				
				//two Ways to call static variable as below:
				
				//1. by direct calling
				
				System.out.println(age);
				
				//2. by using class name
				
				System.out.println(staticandnonstatic.age);
				
				// ways to call non static methods and variables as below:
				
				
				staticandnonstatic obj = new staticandnonstatic();
				obj.sendmail();
				
				System.out.println(obj.name);
				
						

			}
			
			
			// non static method
			
			public void sendmail() {
				
				System.out.println("send mail method");
			}
			
			// static method
			
			
			public static void sum() {
				
				System.out.println("sum method");
				
			}
		

	}
