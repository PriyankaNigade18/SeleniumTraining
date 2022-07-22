package handlingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//frame with index
		//driver.switchTo().frame(0);
			
		//frame with name or id
		//driver.switchTo().frame("mce_0_ifr");
		
		//frame with webElement
		WebElement ele=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(ele);
		
		WebElement ele1=driver.findElement(By.tagName("p"));
		ele1.clear();
		ele1.sendKeys("Hello Everyone!");
		
		
		
		
		
		
		
		
	}

}
