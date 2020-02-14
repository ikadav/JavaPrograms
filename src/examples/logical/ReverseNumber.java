package examples.logical;

import java.util.Scanner;

public class ReverseNumber {
	
	//int inputNum = 321;
	
	int reversed;
	
	public int reverseNum(int inputNum)
	{
		int reminder = 0;
		int mod = 0;
		while (inputNum > 0)
		{
			mod = inputNum / 10;
			System.out.println("Mod is " + mod);
			reminder = inputNum % 10;
			System.out.println("Reminder is "+ reminder);
			reversed = reversed*10 + reminder;
			System.out.println("Reversed is " + reversed);
			inputNum = mod;
		}
		
		return reversed;
	}
	
	public static void main (String args[])
	{
		ReverseNumber rn = new ReverseNumber();
		Scanner s = new Scanner(System.in); 
		System.out.println("Input some number ");
		int input = s.nextInt();
		int reversed = rn.reverseNum(input);
		System.out.println("Reversed Number is " + reversed );
	}
	
	

}
