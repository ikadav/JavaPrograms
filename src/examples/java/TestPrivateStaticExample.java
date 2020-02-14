package examples.java;

public class TestPrivateStaticExample {
	
	public static void main(String args[])
	{
		//This is public static variable
		System.out.println("Testing " + PrivateStaticExample.testField1);
		
		// This is not possible because this is private ----  System.out.println("Testing 111 " + PrivateStaticExample.testField);
	}

}
