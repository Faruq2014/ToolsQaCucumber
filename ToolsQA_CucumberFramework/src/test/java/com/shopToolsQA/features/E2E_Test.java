package com.shopToolsQA.features;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class E2E_Test {


	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shop.demoqa.com");

		driver.findElement(By.cssSelector(".noo-search")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("dress");
		 Actions act = new Actions(driver);
	        act.sendKeys(Keys.ENTER).perform();
	    driver.findElement(By.xpath("//a[contains(text(),'white milkmaid hook and eye bodycon midi dress')]")).click();
		
		WebElement element = driver.findElement(By.id("pa_color"));
		Select color = new Select(element);
	   // day.selectByIndex(19);
	    //day.selectByVisibleText("");
		color.selectByValue("white");
	
		//Thread.sleep(3000);


		WebElement element1 = driver.findElement(By.id("pa_size"));
		Select size = new Select(element1);
	   // day.selectByIndex(19);
	    //day.selectByVisibleText("");
		size.selectByValue("medium");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   driver.findElement(By.xpath("//span[@class='cart-item has-items']")).click();
	   driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
	    //driver.quit();

		
		
		
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
		firstName.sendKeys("Faruq");
		
		WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
		lastName.sendKeys("Molla");
		
		WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
		emailAddress.sendKeys("abz@gmail.com");
		
		WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
		phone.sendKeys("7032223333");
		/*		
		//WebElement countryDropDown = driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]"));
		//WebElement countryDropDown = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single'])[1]"));

		//countryDropDown.click();
		//Thread.sleep(2000);   //(//span[@class='select2-selection select2-selection--single'])[1]
		//driver.quit();
		List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
		for(WebElement country : countryList){
			if(country.getText().equals("India")) {
				country.click();	
				Thread.sleep(3000);
				break;
			}		
		}*/
		


		//WebElement element2 = driver.findElement(By.id("billing_country"));
		//Select country = new Select(element2);
	   // day.selectByIndex(19);
	    //day.selectByVisibleText("");
		//country.selectByValue("Uruguay");
	   //Thread.sleep(1000);
	   


		//driver.findElement(By.xpath("//*[@id='billing_country']")).click();
		//driver.quit();
		//driver.findElement(By.xpath("(//*[text()='United States (US)'])[1]")).click();
		//driver.quit();
		
		driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("pinelake ct");
		driver.findElement(By.cssSelector("#billing_city")).sendKeys("Alexandria");
		
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]")).click();
		driver.findElement(By.xpath("//li[text()='Alabama']")).click();
		//driver.quit();
		
		driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("22300");
		
		List<WebElement> chkBx = driver.findElements(By.name("terms"));
        chkBx.get(0).click();
        Thread.sleep(1000);
        //chkBx.clear();

		
		driver.findElement(By.cssSelector("#place_order")).click();
		
		String text=driver.findElement(By.xpath("//p[@class='woocommerce-thankyou-order-received']")).getText();
		System.out.println(text);
		String OrderNumber =driver.findElement(By.xpath("//li[@class='order']")).getText();
		System.out.println("your order number is "+" "+OrderNumber);
		//driver.quit();



		/*
		 * 
		 */

		
	}

	

}
