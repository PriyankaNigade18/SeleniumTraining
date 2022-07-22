package collectionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1
{
	int id=100;//instance
	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		//Compile time 
		System.out.println("Program started!.....");
		Thread.sleep(3000);
		System.out.println("Program Ended!......");
		
		
		
		File f1=new File("path of the file");
		FileInputStream fs=new FileInputStream(f1);
		
		
		
		
		
		
		
		
		
		//Run time Exception
//		ExceptionDemo1 e1=new ExceptionDemo1();
//		e1=null;
//		try {
//			System.out.println(e1.id);//NullPointerException
//		} catch (Exception e) {
//			System.out.println("Object is Null check Object");
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number between 0 to 3");
//		int index=sc.nextInt();
//		int arr[]= {10,20,30,40};
//		try {
//			System.out.println(arr[index]);//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Please select valid index otherwise: "+e.getMessage());
//		}
//		
//		System.out.println("Program completed!");
//		sc.close();
		
		
		
		
		
		
		
		
		
		
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter two number");
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			System.out.println("Addition is: "+(a+b));
//			System.out.println("Subtraction is: "+(a-b));
//			try {
//			System.out.println("Division is: "+(a/b));//ArithmeticException
//			}
//			catch(Exception e)
//			{
//				System.out.println("Please select number other than 0 otherwise: "+e.getMessage());
//			}
//			finally
//			{
//				System.out.println("Thank you!");
//			}
//			System.out.println("Multiplication is: "+(a*b));
//			sc.close();
			
			
			
			

	}

}
