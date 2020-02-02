package pageObjectsE2E;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PlaceOrderPage {
	WebDriver driver;	
	public PlaceOrderPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//@FindBy(how=How.NAME,using="terms")
	//private List<WebElement> term;
	public void user_select_on_agreed_button() throws Throwable {
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='terms']")));
		      //     element.click();
		

		List<WebElement> chkBx = driver.findElements(By.name("terms"));
        chkBx.get(0).click();
		
		//WebElement chkBx1 = driver.findElement(By.xpath("//*[@id='terms']"));
		//chkBx1.click();
        System.out.println("need to implements this code");

		//List<WebElement> chkBx = driver.findElements(By.xpath("//*[@id='terms']"));
        //chkBx.get(0).click();
        //chkBx.get(1).click();
        Thread.sleep(1000);
        
		//List<WebElement> chkBx = term;
        //chkBx.get(0).click();
		//chkBx.get(0).click();
       // Thread.sleep(1000);
	   }
	
	@FindBy(how=How.CSS, using="#place_order")
	private WebElement placeOrder;
	public void user_click_on_Place_order() {
		placeOrder.click();
		//driver.findElement(By.cssSelector("#place_order")).click();   
	}
	
	public void user_will_find_order_confirmation_page() throws Throwable {
	   }
	@FindBy(how=How.XPATH, using="//p[@class='woocommerce-thankyou-order-received']")
	private WebElement thankyou;
	public void user_will_find_thank_you_message() throws Throwable {
		String text= thankyou.getText();
	   System.out.println(text);  
	}
	@FindBy(how=How.XPATH, using= "//li[@class='order']")
	private WebElement Onumber;
	public void user_will_find_order_number() {
		String OrderNumber =Onumber.getText();
		System.out.println("your order number is "+" "+OrderNumber);
	}
	
	

}
