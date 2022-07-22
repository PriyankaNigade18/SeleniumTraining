package week2;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a character");
			String data=sc.nextLine();
			char ch=data.charAt(0);
			
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				System.out.println(ch+" is Vowel");
			}else
			{
				System.out.println(ch+" is not vowel");
			}
			
			
			
			
//			if(ch=='a'||ch=='A')
//			{
//				System.out.println(ch+" is vowel");
//			}
//			else if(ch=='e'|| ch=='E')
//			{
//				System.out.println(ch+" is vowel");
//			}else if(ch=='i'||ch=='I')
//			{
//				System.out.println(ch+" is vowel");
//			}else if(ch=='o'||ch=='O')
//			{
//				System.out.println(ch+" is vowel");
//			}
//			else if(ch=='u'||ch=='U')
//			{
//				System.out.println(ch+" is vowel");
//			}else
//			{
//				System.out.println(ch +" is not vowel");
//			}
			sc.close();	

	}

}
