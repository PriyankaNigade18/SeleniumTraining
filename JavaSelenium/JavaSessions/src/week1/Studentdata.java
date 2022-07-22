package week1;

public class Studentdata
{
	
	//data
	String name;
	int id;
	
	//Method
	public void show()
	{
		System.out.println("Student name is: "+name);
		System.out.println("student id is: "+id);
	}
	
	public static void main(String[] args) 
	{
		//Object to call class details
		Studentdata s1=new Studentdata();
		s1.show();
		s1.name="Ram";
		s1.id=10;
		s1.show();
		
		System.out.println("********************************");
		//2nd object
		
		Studentdata s2=new Studentdata();
		s2.name="Seema";
		s2.id=20;
		s2.show();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
