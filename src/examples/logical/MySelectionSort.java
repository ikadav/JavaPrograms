package examples.logical;

public class MySelectionSort {
	
	
	public static void main(String args[])
	{
		int[] intArray = {45,72,22,-100,3,10,99};

		selectionSort(intArray);
	}
	
	public static void swap(int[] array, int i,  int j)
	{
		if (i == j) return;
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	public static void selectionSort(int[] inputArray)
	{		
		for (int lastUnsortedIndex=inputArray.length-1; lastUnsortedIndex>0 ; lastUnsortedIndex--)
		{
			int large = 0;
			for (int j=1 ; j<=lastUnsortedIndex; j++)
			{
				if (inputArray[j] > inputArray[large])
				{
					large = j;
				}
			}
			
			swap(inputArray, large, lastUnsortedIndex);
		}
		
		for (int k=0; k < inputArray.length; k++)
		{
			System.out.println(inputArray[k]);
		}
	}

	
	
	

}
