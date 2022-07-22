package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		
		driver.switchTo().frame("iframeResult");
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Smiley']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		System.out.println("Observe size.....Mouse over is completed!");

	}

}
