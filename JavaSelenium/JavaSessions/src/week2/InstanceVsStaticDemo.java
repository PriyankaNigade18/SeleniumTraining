package week2;

public class InstanceVsStaticDemo 
{
	//int count=1;instance
	static int count=1;
	InstanceVsStaticDemo()
	{
		System.out.println(count);
		count++;
		
	}

	public static void main(String[] args)
	{
		InstanceVsStaticDemo v1=new InstanceVsStaticDemo();
		InstanceVsStaticDemo v2=new InstanceVsStaticDemo();
		InstanceVsStaticDemo v3=new InstanceVsStaticDemo();
		InstanceVsStaticDemo v4=new InstanceVsStaticDemo();
		InstanceVsStaticDemo v5=new InstanceVsStaticDemo();
		

	}

}
