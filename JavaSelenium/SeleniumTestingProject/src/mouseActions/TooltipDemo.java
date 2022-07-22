package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.id("age"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		String text=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println("Tool tip is: "+text);
		
		
	}

}
