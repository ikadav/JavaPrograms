package examples.java;
import java.io.IOException;

public class TestException {
	
	public void doSomething() throws IOException
	{
		throw new IOException();
	}
	
	public void doNothing()
	{
		//doSomething(); // Uncomment & see
	}

}
