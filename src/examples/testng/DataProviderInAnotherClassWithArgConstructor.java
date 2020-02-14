package examples.testng;
import org.testng.annotations.Test;

public class DataProviderInAnotherClassWithArgConstructor {
	
	int executionCount = 0;
	
	public DataProviderInAnotherClassWithArgConstructor(int execCount)
	{
		this.executionCount = execCount;
	}
	
	//This will not run since its having constructor with Arguments. 
	//Now, you have to make the dataProvider as static in DataproviderExample.class - Its not working too :-(
	
	@Test(dataProvider = "getData", dataProviderClass = DataproviderExample.class)
	public void setData(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}
	
	

}
