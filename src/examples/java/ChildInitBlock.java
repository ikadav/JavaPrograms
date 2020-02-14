package examples.java;

public class ChildInitBlock extends ParentInitBlock{
	
	public ChildInitBlock() {
		System.out.println("In Child Constructor ....");
		
	} 
	
	{
		System.out.println("In Child Init Block Order 1 ...");
	}
	
	{
		System.out.println("In Child Init Block Order 2...");
	}
	static {
		System.out.println("In Child Static Block....");
	}
	
	public static void main(String args[])
	{
		ChildInitBlock cib = new ChildInitBlock();
	}


}
