package dropdownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.ElementUtil;

public class FacebookApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		
		
		//day
		WebElement day=driver.findElement(By.id("day"));
		ElementUtil.dropdownSelection(day,"6");
		
		//moth
		WebElement month=driver.findElement(By.id("month"));
		ElementUtil.dropdownSelection(month,"Apr");
		
		//year
		WebElement year=driver.findElement(By.id("year"));
		ElementUtil.dropdownSelection(year,"2020");
		
		
		
		
		
		
		
		
		
		
		
		//Select daydd=new Select(dd1);
//		daydd.selectByVisibleText("10");
//		Thread.sleep(3000);
//		daydd.selectByIndex(0);
//		Thread.sleep(3000);
//		daydd.selectByValue("30");
		
		//all
		
//		List<WebElement> alloptions=daydd.getOptions();
//		System.out.println("Total options are: "+alloptions.size());
//		System.out.println("Is drop down supports multiple selection:? "+daydd.isMultiple());
//		
//		for(WebElement i:alloptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("3"))
//			{
//				i.click();
//				break;
//			}
//		}
//		
		
		
//		Select monthdd=new Select(dd2);
//		monthdd.getOptions();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
