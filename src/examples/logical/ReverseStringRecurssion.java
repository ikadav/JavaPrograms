package examples.logical;

import java.util.Scanner;

public class ReverseStringRecurssion {
	String revStr = "";
	public String revString(String input)
	{
		if (input.length() == 1)
			return input;
		
		return revStr + input.charAt(input.length() -1 ) + revString(input.substring(0, input.length()-1));
	}
	
	public static void main(String args[])
	{
		ReverseStringRecurssion rsr = new ReverseStringRecurssion();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String ..");
		String inputStr = s.next();
		String outputStr = rsr.revString(inputStr);
		System.out.println("The reversed string " + outputStr);
		
	}
	
}
