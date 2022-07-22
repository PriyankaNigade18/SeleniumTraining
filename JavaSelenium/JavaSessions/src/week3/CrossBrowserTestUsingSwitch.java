package week3;

import java.util.Scanner;

public class CrossBrowserTestUsingSwitch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test is running on chrome");
			break;
		case "ie":
			System.out.println("Test is running on Internet Explorer");
			break;
		case "firefox":
			System.out.println("Test is running on Firefox");
			break;
		case "edge":
			System.out.println("Test is running on Edge");
			break;
			default:
				System.out.println("Please provide accurate browser name");
			
		}
		sc.close();
		

	}

}
