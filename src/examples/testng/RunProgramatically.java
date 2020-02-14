package examples.testng;

import org.testng.TestNG;
import org.testng.annotations.Factory;

public class RunProgramatically {
	
	public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { DataProviderInAnotherClassWithArgConstructor1.class });
        testng.run();
    }
	
	/*@Factory
    public Object[] create() {
        return new Object[] { new DataProviderInAnotherClassWithArgConstructor1("Test1"), new DataProviderInAnotherClassWithArgConstructor1("Test2")};
    }*/

}
