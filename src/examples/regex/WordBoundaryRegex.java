package examples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.geeksforgeeks.org/regex-boundary-matchers-in-java/

public class WordBoundaryRegex {

	public static void main(String[] args) {

		String txt = "geeksforgeeks geekspractice";

		// Demonstrating beginning of word boundry
		String regex1 = "\\bgeeks"; // Matched at two places
		Pattern pattern1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
		Matcher matcher1 = pattern1.matcher(txt);
		while (matcher1.find()) {
			System.out.println("Start index: " + matcher1.start());
			System.out.println("End index: " + matcher1.end());
		}

		// Demonstrating end of word boundry
		String regex2 = "geeks\\b"; // Matched at one place
		Pattern pattern2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher(txt);
		while (matcher2.find()) {
			System.out.println("\nStart index: " + matcher2.start());
			System.out.println("End index: " + matcher2.end());
		}
	}

}
