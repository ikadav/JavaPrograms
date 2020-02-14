package examples.testng;

import org.testng.TestNG;

public class RunFactoryProgramatically {
	
	public static void main(String[] args) {
	
		TestNG testNG = new TestNG();
		testNG.setTestClasses(new Class[] {SimpleTestFactory.class});
		testNG.run();

	}

}
