package examples.java;

public class StaticReference {
	
	 static StaticReference stRef = new StaticReference();
	
	int x;
	
	static {
		System.out.println(StaticReference.stRef.x);
		StaticReference.stRef = StaticReference.init();
		StaticReference.stRef.x = 10;
	}
	
	public static StaticReference  init()
	{
		return new StaticReference();
		//iAmNonStatic();you cannot call a non static method inside a static method
	}
	
	public static void main(String[] args) {
		System.out.println(StaticReference.stRef.x);
		//iAmNonStatic();you cannot call a non static method inside a static method
		StaticReference sr = new StaticReference();
		sr.iAmNonStatic();
	}
	
	public void iAmNonStatic()
	{
		System.out.println("Inside Non static");
	}

}
