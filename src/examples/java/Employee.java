package examples.java;
import java.util.ArrayList;

public class Employee {
	
	int id;
	String name;
	String emailId;
	
	Employee(int id, String name, String emailId)
	{
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static void main(String args[])
	{
		Employee e1 = new Employee(100,"David","david@cisco.com");
		Employee e2 = new Employee(200,"Solomon","solomon@cisco.com");
		Employee e3 = new Employee(300,"Raj","raj@cisco.com");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		

	}

}
