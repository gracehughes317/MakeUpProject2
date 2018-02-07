
public class Greeter {

	private String name;
	private int age;
	
	public Greeter()
	{
		name = "John Smith";
		age = 20;
	}

	public Greeter(String xname, int xage)
	{
	name = xname;
	age = xage;
	}
	
	public String toString()
	{
		return "Name: "+ name + " Age: " + age;
		
	}
	
	
	
}
