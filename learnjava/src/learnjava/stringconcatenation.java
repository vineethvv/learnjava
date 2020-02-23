package learnjava;

public class stringconcatenation {

	public static void main(String[] args) {
		
		
		int a= 100;
		int b= 200;
		
		String x= "Hello";
		String y = "world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println("the value of a is :"+(a+b));
	}

}
