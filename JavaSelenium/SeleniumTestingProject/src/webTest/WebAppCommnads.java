package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAppCommnads {

	public static void main(String[] args)
	{

		//to launch browser
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to open application
		driver.get("https://www.google.com");
		//to capture title
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
		//to capture current url
		String curl=driver.getCurrentUrl();
		if(curl==null)
		{
			return;
		}else
		{
		System.out.println("Current url is:"+curl);
		}
		
		
		//To capture page source
		//System.out.println(driver.getPageSource());
		
		
		
		
		
		
		
		
		

	}

}
