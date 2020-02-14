package examples.logical;

public class MyBubbleSort {
	
	public static void main(String args[])
	{
		int[] intArray = {45,72,22,-100,3,10,99};
		
		int temp = 0;
		
		for (int i=intArray.length-1; i>0; i--)
		{
			for (int j=0; j<i; j++)
			{
				if (intArray[j] > intArray[j+1])
				{
					//System.out.println("PRINTING");
					temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
							
				}
			}
		}
		
		for (int k=0; k < intArray.length; k++)
		{
			System.out.println(intArray[k]);
		}
		
		
	}

}
