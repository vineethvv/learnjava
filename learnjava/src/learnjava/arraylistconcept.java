package learnjava;

import java.util.ArrayList;

public class arraylistconcept {

	public static void main(String[] args) {
		
		
        ArrayList ar = new ArrayList();
		
		ar.add(100); //0    // "add" is a method
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add("tom"); //3
		ar.add(12.33); //4
		ar.add('m');   //5
		
		System.out.println(ar.size());
		
		ar.remove(5);   // to remove the list
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3)); 
		
		//System.out.println(ar.get(6)); // here i will throw "IndexOutOfBoundsException" cz 6th index does not exists
		
		// to print all the values of array list by using for loop
		
		for(int i =0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		// For adding only integer values
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		
		//ar1.add("tom");  // any value other than interger is not allowed here
		
		
		// for adding only string values
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("vineeth");
		
		//ar2.add(100);    //  any value other than string is not allowed here


	}

}
