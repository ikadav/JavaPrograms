package examples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGrouping {
	
	public static void main(String args[])
	{
		String dateStr = "09/12/2017";
		Pattern datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		Matcher m = datePatt.matcher(dateStr);
		if (m.matches()) {
		  int day   = Integer.parseInt(m.group(1));
		  int month = Integer.parseInt(m.group(2));
		  int year  = Integer.parseInt(m.group(3));
		  
			System.out.println("Day is " + day);
			System.out.println("Month is " + month);
			System.out.println("Year is " + year);

		}
		
	}

}
