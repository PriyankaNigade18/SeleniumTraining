package week2;

public class EmpData 
{
	//instance variable
	String ename="Sagar";
	int eid=100;
	
	public EmpData()
	{
		System.out.println("Data get assigned by constructor: "+ename);
		System.out.println("Data get assigned by constructor: "+eid);
	}
	
	public EmpData(String name)//parameter name=Smita
	{
		System.out.println(name);
		
	}

	public static void main(String[] args)
	{
		//create Object
		EmpData e1=new EmpData();//default type always get called by jvm
	
		EmpData e2=new EmpData("Smita");//parameterize 
		//original data if we are passing it is called argument
		//variable when we pass that is called parameter
	}

}
