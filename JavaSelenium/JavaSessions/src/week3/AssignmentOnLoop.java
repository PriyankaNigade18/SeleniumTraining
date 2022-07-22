package week3;

public class AssignmentOnLoop {

	public static void main(String[] args)
	{
		
		//Palindrome
		
			int num=123,temp=num,rem,sum=0;
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum*10+rem;
			}
		System.out.println("Reverse of "+temp+" is : "+sum);
		
		if(temp==sum)
		{
			System.out.println(temp+" is Palindrome");
		}else
		{
			System.out.println(temp+" is not Palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		//Swapping between two number
//		int a=10,b=20,temp;
//		System.out.println("Before Swapping a="+a+" & b="+b);
////		temp=a;
////		a=b;
////		b=temp;
//		
//		a=a+b;//a=30
//		b=a-b;//30-20 b=10
//		a=a-b;//30-10 a=20
		
		
		
		
		//System.out.println("After Swapping a="+a+" & b="+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Factorial of number
//		int fact=1;
//		for(int i=5;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println("factorial of number 5 is: "+fact);
//		System.out.println("**************************************");

	}

}
