package dataAbstraction;

public class ChildInteface implements ParentInteface
{

	public static void main(String[] args)
	{
		
		//child class ref and child class object
		ChildInteface c1=new ChildInteface();
		c1.accept();
		c1.show();
		//c1.x=900;
		System.out.println(c1.x);
		
		//Parent class ref and child class object
		
		ParentInteface p1=new ChildInteface();
		p1.accept();
		p1.show();
		
		
		

	}

	@Override
	public void accept()
	{
		System.out.println("This is Accept implemented by child class");
		
	}

	@Override
	public void show() {
		System.out.println("This is Show implemented by child class");
		
	}

}
