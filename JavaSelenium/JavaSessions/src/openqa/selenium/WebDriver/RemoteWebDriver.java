package openqa.selenium.WebDriver;

public class RemoteWebDriver implements SearchContext,WebDriver
{

	@Override
	public void get(String url) {
		System.out.println("Get open Application...."+url);
		
	}

	@Override
	public String getTitle() {
		String title="ApplicationTitle";
		return title;
	}

	@Override
	public String getCurrentUrl() {
		String url="Currenturl";
		return url;
	}

	@Override
	public void close() {
		System.out.println("Application get close");
		
	}

	@Override
	public void findElement() {
		System.out.println("FindElement will identify single element");
		
	}

	@Override
	public void findElements() {
		System.out.println("Findelements will identify multiple webelements");
		
	}

}
