package oopconceptpart1;

public class wraperclass {

	public static void main(String[] args) {
		
		
		String x = "100";
		System.out.println(x+20);
		
		// data conversion from string to int
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// Integer, Double, Character, Boolean---> these are the some wrapper classes available in java
		
		// data conversion from string to double
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//data conversion from int to string
		
		int j= 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		// data conversion from string to int when the given string consists of both numerical & alpha characters
		
		String o = "100A";
		Integer.parseInt(o); // here it will throw "number format exception" 
		
		
		

	}

}
