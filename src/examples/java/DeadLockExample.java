package examples.java;

public class DeadLockExample {
	
	public static void main (String args[])
	{
		 final String str1 = "String one";
		 final String str2 = "String two";//********* Try giving the same value String one here. No deadlock*******/
		
		Thread firstThread = new Thread() {
			
			public void run() {
				
			//	System.out.println("Inside first thread");
				
				synchronized (str1)
				{
					System.out.println("Thread1 getting str1 lock");
					try {
						Thread.sleep(100);
					}
					catch (Exception e)
					{
						
					}
					
					synchronized (str2) {
						
						System.out.println("Thread1 getting str2 lock");

					}
					
				}
				
				
				
			}
		};
		
		Thread secondThread = new Thread() {
			
			public void run() {
				
			//	System.out.println("Inside second thread");
				
				synchronized (str2) {
					
					System.out.println("Thread2 getting str2 lock");
					
					try {
						Thread.sleep(100);
					}
					catch (Exception e)
					{
						
					}
					
					synchronized (str1) {
						System.out.println("Thread2 getting str1 lock");

						
					}
					
				}
				

				
				
			}
		};
				
		firstThread.start();
		secondThread.start();
		
	}

}
