package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement un=driver.findElement(By.id("txtUsername"));
		if(un.isEnabled() && un.isDisplayed())
		{
			un.sendKeys("Admin");
		}
		
		
		WebElement psw=driver.findElement(By.name("txtPassword"));
		if(psw.isEnabled() && psw.isDisplayed())
		{
			psw.sendKeys("admin123");
			
		}
		
		
		
		driver.findElement(By.className("button")).click();
	}

}
