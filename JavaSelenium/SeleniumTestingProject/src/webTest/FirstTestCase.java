package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args)
	{
		//launch chrome browser
//		System.setProperty("webdriver.chrome.driver", "C:\\selReq\\DST214\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		//To launch firefox
//		System.setProperty("webdriver.gecko.driver","C:\\selReq\\DST214\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
				
		//To launch Edge
		System.setProperty("webdriver.edge.driver","C:\\selReq\\DST214\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//open application
		driver.get("https://www.google.com");

	}

}
