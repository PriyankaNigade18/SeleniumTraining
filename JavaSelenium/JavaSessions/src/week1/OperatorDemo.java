package week1;

public class OperatorDemo {

	public static void main(String[] args)
	{

		int a=500,b=200;
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Sustraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulas(MOD)is: "+(a%b));
		
		System.out.println("*****************************");
		//Increment Operator (a++ means a=a+1)
		//Post Increment---1 it will pass value then increment
		int x=10;
		int y=x++;
		
		System.out.println(x);//11
		System.out.println(y);//10
		
		int p=99;
		int q=p++;
		
		System.out.println(p);//100
		System.out.println(q);//99
		
		//PreIncrement (++a means a=a+1)
		//1st increment the value then it pass
		
		
		int e=10;
		int f=++e;
		System.out.println(e);
		System.out.println(f);
		
		
		int h=1000;
		int i=++h;
		
		System.out.println(h);//1001
		System.out.println(i);//1001
		
		System.out.println("****************************");
		//Decrement Operator 
		//PostDecrement(a-- means a=a-1)
		
		int a1=10;
		int b1=a1--;
		
		System.out.println(a1);//9
		System.out.println(b1);//10
		
		
		
		int x1=99;
		int y1=x1--;
		System.out.println(x1);//98
		System.out.println(y1);//99
		
		//Predecrement (--a means a=a-1)
		
		int c=20;
		int d=--c;
		
		System.out.println(c);//19
		System.out.println(d);//19
		
		int s=500;
		System.out.println(a==b);//false
		
		System.out.println(a==s);//true
		
		System.out.println(a!=b);//not equal to
		
		
		System.out.println(a==b?true:false);
		
	}

}
