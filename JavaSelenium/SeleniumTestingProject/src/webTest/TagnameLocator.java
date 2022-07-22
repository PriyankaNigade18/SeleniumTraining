package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("https://www.naukri.com/browse-jobs");
		//number of textboxes
//		List<WebElement> textboxes=driver.findElements(By.tagName("input"));
//		System.out.println("Total elements: "+textboxes.size());
		
		//number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+links.size());
		
		for(WebElement i:links)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			String expected="https://www.naukri.com/recruiters";
			if(i.getAttribute("href").contains(expected))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
//		List<WebElement> name=driver.findElements(By.tagName("Priyanka"));
//		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
