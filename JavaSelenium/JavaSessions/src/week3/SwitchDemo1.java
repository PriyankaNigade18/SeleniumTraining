package week3;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number between 0 to 5");
			int num=sc.nextInt();
			
			
			switch (num)
			{
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("Five");
				break;
				default:
					System.out.println("Number is not matching..!");
					
				
			}
			System.out.println("Program Completed...!");
			sc.close();
			
			
			

	}

}
