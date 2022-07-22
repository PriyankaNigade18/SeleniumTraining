package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		System.out.println("Title is: "+actualTitle);
		String expected="Google";
		//validation
		
		if(actualTitle.equals(expected))
		{
			System.out.println("Title matched....TestCase Passed");
		}
		else
		{
			System.out.println("Title not matched....TestCase Failed");
		}
		
		
		//driver.close();   It will current window
		
		driver.quit();//It will close all open windows by Selenium
		
		
		
	}

}
