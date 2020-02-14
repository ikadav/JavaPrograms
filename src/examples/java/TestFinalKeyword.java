package examples.java;

public class TestFinalKeyword {
	
	final  Employee emp_final = new Employee(100, "David","david@cisco.com");
	
	public static void main(String args[])
	{
		TestFinalKeyword tfk = new TestFinalKeyword();
		
		//tfk.emp_final = new Employee(100, "Solomon","davidsol@cisco.com"); //This is not possible
		
		
		tfk.emp_final.setName("Solomon"); // But this is possible
		
		System.out.println("EMployee new name changed .." + tfk.emp_final.getName());
		
	}

}
