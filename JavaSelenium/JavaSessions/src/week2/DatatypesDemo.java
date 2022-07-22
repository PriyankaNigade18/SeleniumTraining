package week2;

public class DatatypesDemo {

	public static void main(String[] args)
	{
		//Boolean type true/false 1bit memory
		boolean status=true;
		System.out.println(status);//true
		status=false;
		System.out.println(status);//false
		System.out.println("*************************************");
		//Numeric
		//integral--->character
		//character char 2 byte memory-single character,special character,ASCII value
		char c1='A';
		System.out.println("character data: "+c1);
		char c2='#';
		System.out.println("Special character: "+c2);
		char c3=90;//c3 is storing 90 as Ascii value
		System.out.println("ASCII value is: "+c3);
		//A- Z=65 to 90
		//a-z= 97 to 122
		//0 to 9= 48 to 57	
		System.out.println("*************************************");
		
		//integral--->integer
		//number default type is int
		
		//byte 1byte memory -128 to 127
		
		byte b1=100;
		System.out.println("Byte data: "+b1);
		byte b2=-128;
		System.out.println("Byte data: "+b2);
		//byte b3=128;
		
		//short 2byte -32768 to 32767
		
		short s1=30000;
		
		System.out.println("short data: "+s1);
		short s2=-128;
		System.out.println("short data: "+s2);
		//short s3=50000;
		
		//int 4byte 
		int i1=50000;
		System.out.println("Integer data: "+i1);
		
		//int i2=9999999999;
		//long 8byte  add L/l suffix at the end of number
		
		long l1=9999999999L;
		System.out.println("Long data: "+l1);
		
		System.out.println("***********************************");
		//floating type
		//1.float 4byte 7digit (F/f)     2.double 8byte 16digit(default type)
		double d1=89.67;
		System.out.println("Double type: "+d1);
		
		
		float f1=45.67F;
		System.out.println("float type: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
