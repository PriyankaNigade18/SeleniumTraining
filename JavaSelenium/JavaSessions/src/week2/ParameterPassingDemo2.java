package week2;

import java.util.Scanner;

public class ParameterPassingDemo2 
{
	public void add(int a,int b)//a=x,b=y
	{
		System.out.println("Addition is: "+(a+b));
		
	}

	public static void main(String[] args)
	{
		ParameterPassingDemo2 p1=new ParameterPassingDemo2();
		//p1.add(10, 10);//compile time
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Number for Addition");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//function call
		p1.add(x, y);//Run time parameter passing

		sc.close();
	}

}
