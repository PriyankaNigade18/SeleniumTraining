package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		/*
		//Locator using By class---address
		By searchbox=By.name("q");
		
		//to identification
		WebElement ele1=driver.findElement(searchbox);
		
		//Validation--->Action
		if(ele1.isDisplayed()&& ele1.isEnabled())
		{
			//Action
			ele1.sendKeys("Java");
		}
		*/
		
		//Locator+Identification+action
		driver.findElement(By.name("q")).sendKeys("selenium");
		
//		WebElement ele1=driver.findElement(By.name("q"));
//		ele1.sendKeys("selenium");
		
		
		
		
		
		
		
		
		

	}

}
