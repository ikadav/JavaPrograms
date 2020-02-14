package examples.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBackReferencing {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a String to check the BackRef ");
		String input  = in.next();
		
		//String str = "123456";
		Pattern p = Pattern.compile("(\\d\\d\\d)\\1");
		Matcher m = p.matcher(input);
		System.out.println(m.groupCount());
		while (m.find()) {
			String word = m.group();
			System.out.println(word + " " + m.start() + " " + m.end());
		}
		
	}

}
