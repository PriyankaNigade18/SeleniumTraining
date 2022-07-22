package inheritanceTest;

//final class Demo
class Demo
{
	 final int x=100;//value become fix
	
	public final void getInfo()
	{
		System.out.println("This is information method");
	}
}





public class FinalDemo extends Demo
{
//	@Override
//	public void getInfo()
//	{
//		System.out.println("This is Overrided Method");
//	}

	public static void main(String[] args)
	{
		Demo d1=new Demo();
		System.out.println(d1.x);//100
		//d1.x=200;
		System.out.println(d1.x);//100
		d1.getInfo();
		
		
		Demo d2=new FinalDemo();
		d2.getInfo();

	}

}
