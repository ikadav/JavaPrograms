package examples.threads;

public class MyWaitAndNotifyDemo {
	
	public static void main(String args[])
	{
		MyWorkingObject mo = new MyWorkingObject();
		MyWaiter waiter1 = new MyWaiter(mo);
		MyWaiter waiter2 = new MyWaiter(mo);
		MyWaiter waiter3 = new MyWaiter(mo);
		MyNotifier notifier = new MyNotifier(mo);
		
		waiter1.setName("WAITER1");
		waiter2.setName("WAITER2");
		waiter3.setName("WAITER3");
		notifier.setName("NOTIFIER");
		
		waiter1.start();
		waiter2.start();
		waiter3.start();
		notifier.start();
		
	}

}

class MyWorkingObject {
	
	private String msg;
	
	public void setMsg(String m)
	{
		this.msg = m;
	}
	
	public String getMsg()
	{
		return this.msg;
	}
}

class MyWaiter extends Thread {
	
	MyWorkingObject myObj;
	
	MyWaiter (MyWorkingObject moo)
	{
		myObj = moo;
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "started ...");
		synchronized (myObj) {
			try {
				System.out.println(Thread.currentThread().getName() + "waiting to get notified ...");

				myObj.wait();
				System.out.println(Thread.currentThread().getName() + "got notified ...");
				System.out.println("Msg is " + myObj.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			

			
		}
		
	}
}

class MyNotifier extends Thread {

	MyWorkingObject myObj;

	MyNotifier(MyWorkingObject moo) {
		myObj = moo;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + "started ...");

		synchronized (myObj) {

			System.out.println(Thread.currentThread().getName() + "About to set the msg and notify ...");

			myObj.setMsg("ABCDEFGHIJKL");
			myObj.notifyAll();

			System.out.println(Thread.currentThread().getName() + " notified ...");

		}

	}
}
