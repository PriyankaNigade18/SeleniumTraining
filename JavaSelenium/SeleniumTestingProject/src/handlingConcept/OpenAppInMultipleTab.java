package handlingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAppInMultipleTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
		
		for(int i=1;i<=9;i++)
		{
		WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://www.google.com");
		}
		
	}

}
