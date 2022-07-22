package dropdownAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//p[text()='Enter city or airport']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li//div[@class='sc-jObWnj dmPlWU']//p[@class='sc-dPiLbb kUaZDb']//span[@class='autoCompleteTitle ']"));

		System.out.println("total elements: "+list.size());
	for(WebElement i:list)
	{
		System.out.println(i.getText());
		if(i.getText().contains("Pantnagar, India"))
		{
			i.click();
			System.out.println("Match found...Test Pass!");
			break;
		}
	}







	}

}
