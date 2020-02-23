package oopconceptpart2;

public class testcar {

	public static void main(String[] args) {
		
		
		// this is called static- polymorphism or compile time polymorphism
		
				bmw b = new bmw();
				b.start();    // here there are 2 start method with same name & same arguments , so in that case preference will be given to child class
				b.stop();
				b.refuel();
				b.theftsafety();
				b.engine();
				
				System.out.println("########");
				
				car c = new car();
				
				c.start();
				c.stop();
				c.refuel();
				//c.theftsafety();  // parrent class cannot inherit any properties from child class
				
				System.out.println("########");
				
				// dynamic polymorphism or run time polymorphism ---> child class object can be referred by parent class reference variable 
				
				// top casting is also called as dynamic polymorphism
				
		           car c1 = new bmw();  // here child class object is referred by parent class reference variable , so it is called as dynamic polymorphism
		           c1.start();
		           c1.stop();
		           c1.refuel();
		           //c1.theftsafety();  // this is also not possible 
		           
		           
		           // down casting
		           
		           bmw b1 = (bmw)new car(); // down casting is not possible , it will throw "classcast exception"

	}                                       // (bmw)new car() --- this entire thing is called as bmw class object, this is also known as casting

}
