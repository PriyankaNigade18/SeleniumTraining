package dataAbstraction;

public class Child extends Parentabstract
{
	public void data()
	{
		System.out.println("This is child class data method");
	}

	public static void main(String[] args)
	{
		//Parent class ref and parent class Object
		//Parentabstract p1=new Parentabstract();
		
		//child class ref and child class object
		Child c1=new Child();
		c1.data();//individual
		c1.accept();//inherited 
		c1.show();//inherited abstract and override
		
		//Parent class ref and child class object
		Parentabstract p2=new Child();
		p2.accept();
		p2.show();
		
		
		//invalid
		//Child class ref and parent class Object
		//Child c2=new Parentabstract();
		
		

	}

	@Override
	public void show()
	{
		System.out.println("Show method updated by child");
		
	}

}
