package examples.testng;
import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithItestContext {
	
	@Test(dataProvider = "getData", groups= {"FIRST"})
	public void setData(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}
	
	@Test(dataProvider = "getData",groups= {"SECOND"})
	public void setData1(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}
	
	@Test(dataProvider = "getData",groups= {"FIRST"})
	public void setData2(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}
	
	@Test(dataProvider = "getData",groups= {"FIRST"})
	public void setData3(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}

	@DataProvider
	public Object[][] getData(ITestContext itc) {
		// Rows - Number of times your test has to be repeated.
		// Columns - Number of parameters in test data.
		Object[][] data = new Object[3][2];

		System.out.println("Group name " + itc.getIncludedGroups());
		
		for (String included_grp : itc.getIncludedGroups()) // USE TESTNG.XML FILE TO INCLUDE GROUPS
		{
			System.out.println("Group name " + included_grp);

			if (included_grp.equalsIgnoreCase("FIRST"))
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
			
			if (included_grp.equalsIgnoreCase("SECOND"))
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


		}
		
		
		// 1st row
		
		return data;
	}

}
