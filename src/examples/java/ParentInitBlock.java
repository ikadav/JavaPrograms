package examples.java;

public class ParentInitBlock {
	
	public ParentInitBlock() {
		System.out.println("In Parent Constructor ....");
	}
	{
		System.out.println("In Parent Init Block Order 1...");
	}
	{
		System.out.println("In Parent Init Block Order 2...");
	}
	static {
		System.out.println("In Parent Static Block ....");
	}

}
