package examples.java;

public class MyFirstThread implements Runnable{
	
	public void run()
	{
		for (int x=0; x < 5; x++)
		{
			System.out.println("My first thread running" + Thread.currentThread().getName());
		}
	}
	
	public static void main(String args[])
	{
		MyFirstThread mft = new MyFirstThread();
		Thread t = new Thread(mft);
		t.setName("T1");
		Thread t1 = new Thread(mft);
		t1.setName("T2");
		Thread t2 = new Thread(mft);
		t2.setName("T3");
		t.start();
		t1.start();
		t2.start();

	}

}
