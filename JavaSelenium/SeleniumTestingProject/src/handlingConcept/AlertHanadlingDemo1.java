package handlingConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHanadlingDemo1 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt.getText());
		//handling
		alt.accept();
		//Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("piyu1818@gmail.com");
		

	}

}
