package learnjava;

public class arrayconcept {

	public static void main(String[] args) 
	
	{
		
		//1. int arrayy
		
		// One dimensional array
		
		int i[]= new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		
		System.out.println(i[0]);
		
		//System.out.println(i[4]); // here it will throws an exception as array index out of bound exception
		
		System.out.println(i.length); // size/length of array
		
		
		// To print all the value of array ---> Using for loop
		
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
			
		
			}
		
		//2.Similarly we can do the same in ---> double, char, boolena, string
		
		//3. Object array---> It is used to store different data type value
		
		Object ob[]= new Object[4];
		
		ob[0]= "vineeth";
		ob[1]= 25;
		ob[2]= 12.33;
		ob[3]= 'v';
		
		System.out.println(ob[3]);
		System.out.println(ob.length);
		
		
		
		
		
		
		

	}
	
}
