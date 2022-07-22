package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		//contains()
		driver.findElement(By.xpath("//input[contains(@id,'Username')]")).sendKeys("Priyanka");
	
		//startsWith()
		driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("admin123");
		
		//contains() with text()
		driver.findElement(By.xpath(" //a[contains(text(),'password')]")).click();
		
		
		
		
		
	
	
	
	
	}

}
