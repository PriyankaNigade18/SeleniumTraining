package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//tagname with id
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Priyanka");
		
		
		//tagname with attribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Priyanka");
		
		//tagname with class name
		//driver.findElement(By.cssSelector("input.button")).click();
		
		//tagname ,class name and attribute
		driver.findElement(By.cssSelector("input.button[type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
