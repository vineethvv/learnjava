package learnjava;

public class incrementanddecrementoperators {

	public static void main(String[] args) {
		
		int i = 1;
		int j= i++; // post increment---> giving the value of i to j and increase the value of i by 1.
		
		System.out.println(i);
		System.out.println(j);
		
		int a =1;
		int b= ++a;// pre increment----> first increasing the value of a by 1 then giving that value to b.
		
		System.out.println(a);
		System.out.println(b);
		
		
		int m= 2;
		int n= m--; // post decrement
		
		System.out.println(m);
		System.out.println(n);
		
		
		int o= 2;
		int p = --o; // pre decrement
		
		System.out.println(o);
		System.out.println(p);
		
		
		
		

	}

}
