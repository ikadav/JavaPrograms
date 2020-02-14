package examples.java;

public class TestStringImmutability {
	public static void main(String[] args)
	{
		String s = "ab";
		String t = s;
		System.out.println(s);
		t="test"+s;
		System.out.println(t);
		System.out.println(s);
	}

}
