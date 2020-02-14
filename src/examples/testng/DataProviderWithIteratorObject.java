package examples.testng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithIteratorObject {
	
	@Test(dataProvider = "getData")
	public void setData1(String language, String secondLanguage, String thirdlanguage) {
		
		System.out.println("First value is " + language);
		System.out.println("Second value is " + secondLanguage);
		System.out.println("Second value is " + thirdlanguage);


		
	}
	
	@DataProvider(name="getData")
	public static Iterator<Object[]> getData() {
		List<Object[]> data = new ArrayList<>();
	    data.add(new String[]{"ja","en","abcd"});
	    data.add(new String[]{"ja_JP.PCK","ko","efgh"});
	    data.add(new String[]{"ja_JP.eucJP","us","ijkl"});
		
	    return data.iterator();
	}

}
