package examples.java;

public class StaticMethodOverrideExtended extends StaticMethodOverride {
	
	static void doStuff()
	{
		System.out.println("I am in Extended class....");
	}
	
	public static void main (String args[])
	{
		StaticMethodOverride smo = new StaticMethodOverride();
		StaticMethodOverrideExtended smoe = new StaticMethodOverrideExtended();
		StaticMethodOverride smoeo = new StaticMethodOverrideExtended();

		
		smo.doStuff(); //no need to create object
		smoe.doStuff();//no need to create object
		smoeo.doStuff();
		//ITS VERY IMPORTANT. ITS CALLED BASED ON THE REFERENCE VARIABLE CLASS NAME. RUN IT & CHECK IT
	}

}
