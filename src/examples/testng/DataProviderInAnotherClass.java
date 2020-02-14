package examples.testng;
import org.testng.annotations.Test;

public class DataProviderInAnotherClass {
	
	@Test(dataProvider = "getData", dataProviderClass = DataproviderExample.class)
	public void setData(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}

}
