package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		driver.switchTo().frame(0);
		
		WebElement ele1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		//act.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
		act.dragAndDrop(ele1, ele2).build().perform();
		
		
		
		
	}

}
