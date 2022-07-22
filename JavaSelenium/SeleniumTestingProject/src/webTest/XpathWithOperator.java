package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithOperator {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@type='text' and @id='txtUsername']")).sendKeys("Hi");
		
		driver.findElement(By.xpath("//input[@type='password' or @id='txtUserna']")).sendKeys("hello");
		
		//xpath with text()
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
		
		
		
		
		
		
	}

}
