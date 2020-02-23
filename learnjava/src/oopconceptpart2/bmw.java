package oopconceptpart2;

public class bmw extends car   {  // "has a relationship" means class to class relationship
	
	
	// 'extends' keyword---> is used to make a relationship b/w 2 classes
	
		// this is method overridding----> It means that when same method is present in parent class as well as in the child class with the same name and same number of arguments
		
		public void start() {  // this called overriden method
			
			System.out.println("bmw-- start");
		}
		
		public void theftsafety() {
			
			System.out.println("bmw--theftsafety");
		}

}
