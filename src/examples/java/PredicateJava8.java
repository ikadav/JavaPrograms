package examples.java;
import java.util.function.Predicate;

public class PredicateJava8 {

	  public static void main(String[] args) {
	    Predicate<String> i  = (s)-> s.length() > 5;
	   
	    System.out.println(i.test("java2s.com "));
	  }
	}


