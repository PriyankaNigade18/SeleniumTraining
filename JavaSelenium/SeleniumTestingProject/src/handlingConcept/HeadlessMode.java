package handlingConcept;

import java.time.Duration;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		
		//Headless mode
		ChromeOptions op=new ChromeOptions();
		op.setHeadless(true);
		WebDriver driver=new ChromeDriver(op);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//parent window
		System.out.println("Orangehrm application open!");
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		System.out.println("LinkedIn page open!");
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		
		for(String child:allwindow)
		{
			if(!parentid.equals(child))
			{//Switch to child window
				driver.switchTo().window(child);
				System.out.println("You are on child window!");
				driver.findElement(By.id("email-or-phone")).sendKeys("piyu1818@gmail.com");
				System.out.println("Email Id has Entered!");
				//driver.close();//close current window
				//driver.quit();//all open windows by selenium
			}
		}
		//parent
		driver.switchTo().window(parentid);
		System.out.println("You are on Parent window!");
		System.out.println("Current url is: "+driver.getCurrentUrl());
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		System.out.println("User name passed....Test Completed!");
		
		
		
		
		
		
		
		
		/*
		//Capabilities---->Browser set up
		ChromeDriver cr=new ChromeDriver();
		Capabilities cap=cr.getCapabilities();
		System.out.println(cap.getBrowserName());
		System.out.println(cap.getPlatformName());
		//all properties
		Map<String,Object> allp=cap.asMap();
		System.out.println(allp);		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
