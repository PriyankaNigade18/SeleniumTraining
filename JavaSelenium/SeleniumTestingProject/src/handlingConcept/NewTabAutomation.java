package handlingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
		
		//New tab
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.facebook.com");
		System.out.println("Title From new Tab : "+newTab.getTitle());
		//New Window
		WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get("https://www.amazon.in");
		System.out.println("Title from new Window: "+newWindow.getTitle());
	}

}
