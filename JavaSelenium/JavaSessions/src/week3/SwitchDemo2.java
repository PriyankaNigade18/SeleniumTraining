package week3;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args)
	{
		//switch can work with integral--->integer 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any character");
			String chr=sc.nextLine();
			char data=chr.charAt(0);
			switch (data) {
			case 'a':
				System.out.println(data+" is vowel");
				break;
			case 'e':
				System.out.println(data+" is vowel");
				break;
			case 'i':
				System.out.println(data+" is vowel");
				break;
			case 'o':
				System.out.println(data+" is vowel");
				break;
			case 'u':
				System.out.println(data+" is vowel");
				break;
				
			default:
				System.out.println(data+" is not vowel");

			
			}
			
			sc.close();
	}

}
