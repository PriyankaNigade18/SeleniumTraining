package handlingConcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//parent window
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		
		for(String child:allwindow)
		{
			if(!parentid.equals(child))
			{//Switch to child window
				driver.switchTo().window(child);
				driver.findElement(By.id("email-or-phone")).sendKeys("piyu1818@gmail.com");
				//driver.close();//close current window
				//driver.quit();//all open windows by selenium
			}
		}
		//parent
		driver.switchTo().window(parentid);
		System.out.println("Current url is: "+driver.getCurrentUrl());
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
