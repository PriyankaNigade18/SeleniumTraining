package openqa.selenium.WebDriver;

public class AppTest {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
