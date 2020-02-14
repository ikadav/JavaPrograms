package examples.java;

public class PrimitivePassByValue {
	
	int localvalue = 5;

	public static void main(String[] args) {
		
		PrimitivePassByValue ppv = new PrimitivePassByValue();
		
		


		ppv.calculate(localvalue);
		
		System.out.println("The local value is " + ppv.localvalue); // This will not work
		
		//System.out.println("The local value is " + localvalue);
		
	}
	
	public  int  calculate(int localvalue)
	{
		return localvalue * 500;
	}

}
