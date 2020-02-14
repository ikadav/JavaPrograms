package examples.lambda;

public class LambdaImpl1 {
	
	public static void main(String args[])
	{
		MyLambdaInterface1 mli = (a,b) -> System.out.println("Sum is " + (a + b));
		mli.add(10, 20);
		mli.add(100, 200);
		mli.add(40, 20);
		
	}

}
