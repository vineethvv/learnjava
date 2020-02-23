package oopconceptpart2;

public class HSBCbank implements usbank, brazilbank { // here we are acheiving multiple inheritance
	
	
	// "Is a relationship" means relationship b/w interface & class
	
		// if a class is implementing any interface then its mandatory to define/override all the methods of interface
		
		// methods from US bank : overriding from us bank
		
		public void credit() {
			
			System.out.println("hsbc--credit");
		}
		
		public void debit() {
			System.out.println("hsbc debit");
		}
		
		public void transfermoney() {
			System.out.println("hsbc---tarnsfer monet");
		}
		
		// hsbc's there own method
		
		public void educationloan() {
			
			System.out.println("hsbc---education loan");
		}
		
		public void carloan() {
			
			System.out.println("hsbc--car loan");
		}
		
		// method from brazil bank : overriding from brazil bank
		
		public void mutualfund() {
			
			System.out.println("hsbc--mutual fund");
		}
			

}
