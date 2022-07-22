package handlingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
		//driver.switchTo().frame("frame-left");
		System.out.println(driver.getPageSource());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		System.out.println(driver.getPageSource());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		System.out.println(driver.getPageSource());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.getPageSource());
		
		
		
		
	}

}
