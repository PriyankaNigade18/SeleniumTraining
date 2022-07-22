package handlingConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt.getText());
		alt.accept();
		WebElement res=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(res.getText());
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alt2=driver.switchTo().alert();	
		System.out.println("Text of alert is: "+alt2.getText());
		alt2.dismiss();
		System.out.println(res.getText());
		
		
		
	}

}
