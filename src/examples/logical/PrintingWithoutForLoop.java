package examples.logical;

public class PrintingWithoutForLoop {
	
	int upto = 20;
	
	public void print(int n)
	{
		if (n <= upto)
		{
			System.out.println("Hello " + n);
			print(n+1);
		}
	}
	
	public static void main(String args[])
	{
		PrintingWithoutForLoop p = new PrintingWithoutForLoop();
		p.print(1);
	}

}
