package examples.testng;
import org.testng.annotations.Test;

public class DataProviderInAnotherClassWithArgConstructor1 {
	
	String param;
	
	public DataProviderInAnotherClassWithArgConstructor1(String param)
	{
		this.param = param;
	}
	
	//This will not run since its having constructor with Arguments. 
	//run it with RunProgramatically.java
	
	@Test
    public void dummyTest() {
        System.out.println("Param is " + param);
    }
	
	

}
