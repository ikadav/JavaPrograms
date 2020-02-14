package examples.threads;

public class MySyncDemo {
	
	public static void main(String args[])
	{
		MyOwnObject mo = new MyOwnObject();
		myThread t1 = new myThread("David Thangaraj", mo);
		myThread t2 = new myThread("Melba Sam", mo);
		t1.start();
		t2.start();
		
	}

}

class MyOwnObject {
	
	public void myTestMethod(String input)
	{
		System.out.println("Hi ...Welcome .." + input);
		//This try is just to show the effect of synchronized. Remove this and check
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Hi ...Bye.. " + input );
	}
}

class myThread extends Thread {
	
	String input;
	MyOwnObject myObj;
	
	myThread (String in, MyOwnObject moo)
	{
		input = in;
		myObj = moo;
	}
	
	public void run() {
		
		synchronized (myObj) {
			myObj.myTestMethod(input);
		}
		
	}
}
