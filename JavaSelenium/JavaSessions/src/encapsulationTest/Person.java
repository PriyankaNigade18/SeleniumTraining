package encapsulationTest;
//this is used to refer current class Object.
public class Person 
{	
	String name;
	
	Person(String n)
	{
		this.name=n;
		System.out.println("Person name is: "+n);
		System.out.println(name);
	}
	//Builder pattern /Method Chaining
	public Person startBrowser()
	{
		System.out.println("Person can start browser...");
		//runBrowser();
		return this;
	}
	public Person runBrowser()
	{
		System.out.println("Person can Run browser...");
		return this;
		//stopBrowser();
	}
	public Person stopBrowser()
	{
		System.out.println("Person can stop browser...");
		return this;
	}
	 
	public static void main(String[] args) 
	{
		Person p1=new Person("Sheetal");
		//Method chaining/Builder pattern
		//p1.startBrowser().runBrowser().stopBrowser().startBrowser().runBrowser().stopBrowser();
		p1.runBrowser().startBrowser();
		
		
		
//		p1.runBrowser();
//		p1.stopBrowser();
		

	}

}
