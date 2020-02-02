package pageObjectsE2E;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void navigateToHomePage() {
	driver.get("http://www.shop.demoqa.com");

}

	public  void init() {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faruq\\eclipse-workspace\\ToolsQA_CucumberFramework\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.get("http://www.shop.demoqa.com");
	
	}
/*
	public static void main(String args[]) {
		HomePage h =new HomePage(driver);
		h.init();
		
	}*/
}

