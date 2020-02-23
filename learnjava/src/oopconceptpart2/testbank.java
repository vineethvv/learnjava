package oopconceptpart2;

public class testbank {

	public static void main(String[] args) {
		
		
       System.out.println(usbank.min_balance);
       
       //usbank.min_balance = 200;       //  we cannot change the value of variables
		
		
		HSBCbank b = new HSBCbank();
		b.credit();
		b.debit();
		b.transfermoney();
		b.carloan();
		b.educationloan();
		
		// dynamic polymorphism---> child class object can be referred by parent interface reference variable 
		
		usbank h= new HSBCbank();
		h.credit();
		h.debit();
		h.transfermoney();
		
		//h.educationloan();  // here it will throw error cz these are the hsbc's there own method so we cannot call them
		//h.carloan();        // here only overridden methods are allowed to call

	}

}
