package examples.java;
import java.io.IOException;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = new String("TEST");
		String s4 = new String("TEST");
		
		if (s1 == s2)
		{
			System.out.println("s1 & s2 are equal");
		}

		if (s3 == s4)
		{
			System.out.println("s3 & s4 are equal");
		}
		
		if (s3.equals(s4))
		{
			System.out.println("s3 & s4 are equal now");

		}	
		
	}
	
	public void doSomething() throws IOException
	{
		throw new IOException();
	}
	
	public void doNothing()
	{
		doSomething();
	}

}
