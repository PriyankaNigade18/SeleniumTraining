package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		//to launch browser
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ww.google.com");
		System.out.println("Title is: "+driver.getTitle());
		
		//Navigate
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();//google
		Thread.sleep(3000);
		driver.navigate().forward();//facebook
		driver.navigate().refresh();
		
		
		
		
	}

}
