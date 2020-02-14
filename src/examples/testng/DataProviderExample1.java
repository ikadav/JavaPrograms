package examples.testng;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {
	
	@Test(dataProvider = "getData")
	public void setData1(Integer i) {
		System.out.println("you have provided username as::" + i);
		System.out.println("you have provided password as::" + i);
	}

	@DataProvider
	public Object[][] getData(Method m) {
		// Rows - Number of times your test has to be repeated.
		// Columns - Number of parameters in test data.
		return new Object[][] {
		      new Object[] { new Integer(42) },
		      new Object[] { new Integer(50) },
		    };

	}

}
