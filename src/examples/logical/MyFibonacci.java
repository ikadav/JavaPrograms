package examples.logical;

import java.util.Scanner;

public class MyFibonacci {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in); 
		System.out.println("Input some number ");
		int input = s.nextInt();
		MyFibonacci mf = new MyFibonacci();
		//mf.printFibo(input);
		//mf.printFibo1(input);
				
		/*for (int counter = 0; counter <= input; counter++)
		{
		      System.out.printf("Fibonacci using recursion %d is: %d\n", counter, fibonacciRecursion(counter));
		}*/
		
		System.out.println("\nFibonacciSeries Recursive...");
	//	fibonacciSeriesRecurisve(-1, 1, input);
		fibo_nonrecursive(input);

		
	}
	
	public void printFibo(int febCount)
	{
		int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++){
                System.out.print(feb[i] + " ");
        }
        System.out.println("\n");
	}
	
	public void printFibo1(int febCount) {
		int n1 = 0, n2 = 1, n3, i;
		
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < febCount; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	/*public static int fibonacciRecursion(int number){ 
		if(number == 1 || number == 2){ 
			return 1; 
			} 
		return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion }
	}*/
	
	
	public static void fibonacciSeriesRecurisve(int a, int b, int length){
		if(length == 0){
		   return;
		  }
		  
		  int c = a+b;
			System.out.println("Recursive version");

		  System.out.print(c + ", ");
		  fibonacciSeriesRecurisve(b, c, length-1);
		 }
	
	//non-recursive version
	public static void fibo_nonrecursive(int input)
	{
	
		/*if(input == 0){
			   return;
			  }
		*/
		int a = -1;
		int b = 1;
		int c = 0;
		System.out.println("Non Recursive version");

		for (int i =0 ; i<= input ; i++)
		{
			c= a+b;
			a = b;
			b = c;
			System.out.print(c + ", ");
		}
		
	}
		

	
}


