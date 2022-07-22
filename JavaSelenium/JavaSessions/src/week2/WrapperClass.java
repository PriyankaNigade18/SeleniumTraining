package week2;

public class WrapperClass {

	public static void main(String[] args)
	{
		//Object to primitive--->Wrapper class parse()
		String s1="100";
		System.out.println(s1+200);//100200
		int num=Integer.parseInt(s1);
		System.out.println(num+200);//300
		
		
		String s2="10.45";//string
		System.out.println(s2+10.11);//10.4510.11
		double d1=Double.parseDouble(s2);
		System.out.println(d1+10.11);
		
		String s3="true";
		boolean b1=Boolean.parseBoolean(s3);
		System.out.println(b1);
		boolean b2=b1;
		
		
		String s4="Firoz";
		char cc1=s4.charAt(0);
		System.out.println("String to character using charAt(): "+cc1);
		
		
		
		
		System.out.println("******************************");
		//primitive to Object ---->valueOf()
		
		int x=100;
		System.out.println(x+100);//200
		String ss1=String.valueOf(x);
		System.out.println(ss1+100);//100100
		
		
		float f2=34.45f;
		String ss2=String.valueOf(f2);
		
		System.out.println("float to string conversion: "+(ss2+11.11));
		
		
		
		
		
		
		
		
//		int i=100;
//		System.out.println(i+200);

	}

}
