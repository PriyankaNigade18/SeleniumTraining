package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement htext=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::div[@id='glow-ingress-block']//span[1]"));
		System.out.println("Text is: "+htext.getText());
		
		
		
		
		WebElement ele1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::a[@class='nav-a  '][4]"));
		
		System.out.println("Text is: "+ele1.getText());
		ele1.click();
		
		
		
		
	}

}
