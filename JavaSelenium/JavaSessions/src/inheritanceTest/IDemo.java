package inheritanceTest;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling from A");
	}
}

class B extends A//single level inheritance A is Parent & B is Child
{
	public void m2()
	{
		System.out.println("M2 is calling from B");
	}
}

class D extends A//Heirachical inheritance
{
	
}


class C extends B//Multilevel inheritance---->B is parent & c is chil\d
{
	public void m3()
	{
		System.out.println("M3 is calling from C");
	}
}

//class x extends D,C//Multiple Inheritance
//{
//	
//}









public class IDemo {

	public static void main(String[] args)
	{

		//Scenario1: Parent class ref and parent class object
		//only parent class method
		
//			A a1=new A();
//			a1.m1();
			
			B b1=new B();
			b1.m1();
			b1.m2();
		
			
		//Scenario 2: child class ref and child class object
			//both parent and child class method we can call
//			B b1=new B();
//			b1.m1();
//			b1.m2();
			
			
			C c1=new C();
			c1.m1();
			c1.m2();
			c1.m3();
			
		//Scenario 3: Parent class ref and child class Object
			//reference always matters-----only parent class method
			
//			A a2=new B();
//			a2.m1();
			
			
			
			B b2=new C();
			b2.m1();
			b2.m2();
			
			
		//Scenario 4: Child class ref and Parent class Object
			//Invalid scenario
			//B b2=new A();
			
			
			
			
			
			
			

	}

}
