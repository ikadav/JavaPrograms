package examples.java;
class First {
	public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	Second(First fp, String str) {
		fobj = fp;
		msg = str;
		//start();
	}
	
	

	public void run() {
		synchronized(fobj)
		{
			fobj.display(msg);
		}
	}
}

public class SyncDemo1 {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");
		
		ss.start();
		
		ss1.start();
		/*try {
			ss1.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		ss2.start();
	}
}