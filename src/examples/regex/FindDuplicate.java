package examples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class FindDuplicate {

	public static void main(String[] args) {
		
		String pattern = "\\b(\\w+)\\b[\\w\\W]*\\b\\1\\b";
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		String phrase = "unique is not duplicate but unique, Duplicate is duplicate.";
		Matcher m = p.matcher(phrase);
		while(m.find())
		{
			String val = m.group();
			System.out.println("Matching subsequence is \"" + val + "\"");
			System.out.println("Duplicate word: " + m.group(1) + "\n");
		}
		
		
	}

}
