package examples.lambda;

public class FirstLambda { //Here you dont need to use the keyword implements 
	
	public static void main(String[] args) {
		
		MyLambdaInterface mi = () -> System.out.println("Hello"); 
		mi.m1();
		}
}
