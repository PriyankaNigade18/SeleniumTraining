package polymorphism;

public class AmazonSearch
{

	//Search
	public void search(String name)
	{
		System.out.println("This is search by name of Product: "+name);
	}

		
	public void search(int price)
	{
		System.out.println("This is search by price of product: "+price);
	}
	
	public void search(String name,String brand)
	{
		System.out.println("This is search for product by name and brand: "+name+" : "+brand);
	}
	
	//Payment
	//by credit card
	//by cash on delivery
	//gpay/upi
	//net banking
	
	
	
	
	
}

