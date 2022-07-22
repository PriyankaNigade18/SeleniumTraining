package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//un
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//psw
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		//login btn
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
