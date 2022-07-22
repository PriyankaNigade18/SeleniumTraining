package collectionDemo;

public class ThrowDemo {

	public static void main(String[] args) 
	{

		String data=null;
		if(data==null)
		{	try {
			throw new Exception("Data is not found");
		}catch(Exception e)
		{
			System.out.println("New Exception is comming");
			e.printStackTrace();
		}
		}

	}

}
