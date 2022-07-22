package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RuntimeParameterPass {

	public static void main(String[] args) throws IOException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		
		
		
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		System.out.println(num);
		
		sc.close();
		
		
		
		
		
		
		
		//method2:
//		System.out.println("Enter number");
//		InputStreamReader ir =new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(ir);
//		String data=br.readLine();
//		int num=Integer.parseInt(data);
//		System.out.println(num);
		
		
		
		
		
		//method 1:read only single character
//		System.out.println("Enter Number: ");
//		int num=System.in.read();//single character 4
//		System.out.println((char)num);//num=Acsii value 4

	}

}
