package examples.lambda;


public class LambdaImpl2 {
	
	public static void main(String args[])
	{
		MyLambdaInterface2 mli = (String s) -> s.length();
		System.out.println("Length is "  + mli.getLength("Testing"));
		System.out.println("Length is "  + mli.getLength("Hello"));
		
		MyLambdaInterface2 mli1 = s -> s.length();
		System.out.println("Length is "  + mli1.getLength("Automation"));
		System.out.println("Length is "  + mli1.getLength("Java"));
	}

}
