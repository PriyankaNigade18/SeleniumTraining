package week3;

public class StringDemo {

	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2); //true
		s1=s1+" hi";
		System.out.println(s1);
		System.out.println(s1==s2);//false

		//String class is always Immutable
		//String class java.lang
//		s1="";
//		s2="100 ";
		
		
		//length()
		System.out.println("Length of string is: "+s1.length());
		
		//conversion toUpperCase()      toLowerCase()
		System.out.println("To conver in uppercase: "+s1.toUpperCase());
		
		System.out.println("To conver in lowercase: "+s1.toLowerCase());
		
		//Equality  1.equals() -Case sensitive    2.equalsIgnoreCase()
		
		String s3="Welcome to Learn Java";
		
		String s4="Welcome to Learn java selenium";
		
		System.out.println(s3==s4);//true Operator always compare id (JVM)
		
		System.out.println(s3.equals(s4));//true  --- compare data/value
		
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		
		//   concat()
		
		System.out.println("Hello"+(100+100));
		//Hello100100
		System.out.println(100+100+"Hello");
		//200Hello
		
		System.out.println(s1.concat(" "+s4));
		
		
		//contains()
		
		System.out.println("check s4 contains selenium: "+s4.contains("TestNG"));
		
		//trim()----To ignore white space before and after string
		String s5="       Welcome All        ";
		System.out.println(s5);
		System.out.println(s5.trim());
		
		//starts-with(Prefix)
		String s6="Selenium WebDriver is WebUI Automation tool";
		System.out.println("Start with selenium: "+s6.startsWith("Sel"));
		
		System.out.println("Ends with tool?"+s6.endsWith("ol"));
		
		//String character charAt()
		System.out.println(s6.charAt(9));//" "
		
		//split(regexp):pattern Matching
		String ss1[]=s6.split(" ");
		
		for(String i:ss1)
		{
			System.out.println(i);
		}
		
		
		String ss2="Java Selenium ";
		String temp="";
		for(int i=ss2.length()-1;i>=0;i--)
		{
			temp=temp+ss2.charAt(i);
		}
		
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
