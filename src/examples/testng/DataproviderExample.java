package examples.testng;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

	// This test method declares that its data should be supplied by the Data
	// Provider
	// "getdata" is the function name which is passing the data
	// Number of columns should match the number of input parameters
	@Test(dataProvider = "getData")
	public void setData(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}
	
	@Test(dataProvider = "getData")
	public void setData1(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}

	@DataProvider
	public static Object[][] getData(Method m) {
		// Rows - Number of times your test has to be repeated.
		// Columns - Number of parameters in test data.
		Object[][] data = new Object[3][2];

		System.out.println("Method name is " + m.getName());
		if (m.getName().equalsIgnoreCase("setData"))
		{
			data[0][0] = "sampleuser1";
			data[0][1] = "abcdef";

			// 2nd row
			data[1][0] = "testuser2";
			data[1][1] = "zxcvb";

			// 3rd row
			data[2][0] = "guestuser3";
			data[2][1] = "pass123";

		}
		
		if (m.getName().equalsIgnoreCase("setData1"))
		{
			data[0][0] = "David";
			data[0][1] = "abcdef";

			// 2nd row
			data[1][0] = "Thangaraj";
			data[1][1] = "zxcvb";

			// 3rd row
			data[2][0] = "Solomon";
			data[2][1] = "pass123";

		}


		// 1st row
		
		return data;
	}
}