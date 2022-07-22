package inheritanceTest;

public class TestCar {

	public static void main(String[] args)
	{
		//Parent class ref and parent class object
		Car c1=new Car();
		c1.start();//------------->car
		c1.stop();
		c1.refule();
		
		System.out.println("********************");
		//child class ref and child class object
	
		BMW b1=new BMW();
		b1.start();//Inherited method/------->BMW
		b1.stop();//Inherited method
		b1.refule();//Inherited method
		b1.autoParking(); //individual method
		
		//Parent class ref and child class 
		Car c2=new BMW();
		c2.start();
		c2.stop();
		c2.refule();
				
		
		
		
		

	}

}
