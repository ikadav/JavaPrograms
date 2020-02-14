package examples.java;

public class TestAnimals1 {
	
	public static void main(String args[])
	{
		Animal1 a = new Animal1();
		Animal1 h = new Horse1();
		Horse1 ho = new Horse1();
		try {
			a.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//h.eat();
		ho.eat();
	}

}
