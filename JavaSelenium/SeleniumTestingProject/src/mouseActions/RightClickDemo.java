package mouseActions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rbtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rbtn).perform();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		System.out.println("Total element: "+list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Copy"))
			{
				i.click();
				break;
			}
			
		}
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		
		
		


	}

}
