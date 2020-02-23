package learnjava;

import java.util.Hashtable;

public class Hashtableconcept {

	public static void main(String[] args) {
		
		
		
       Hashtable h = new Hashtable ();
		
		h.put("a", "test");       // "put" is a method , "a" and "test" are parameters or arguments 
		h.put("b", "hello");
		h.put("c", "world");
		
		h.put(1, 100);
		h.put(2, 200);
		
		h.put(3, "vineeth");
		
		h.put("d", 100);
		
		System.out.println(h.get("c"));
		
		System.out.println(h.get(1));
		
		
		//For adding only integer values
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer> ();
		
		h1.put(1, 100);
		h1.put(2, 200);
		
		//h1.put(3, "vine");  // this is not allowed here both parameters shoudld be integer
		
		// similarly we can give different combinations
		

	}

}
