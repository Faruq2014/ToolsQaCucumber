package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	WebDriver driver;	
	public PlaceOrderPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//@FindBy(how=How.NAME,using="terms")
	//private List<WebElement> term;
	public void user_select_on_agreed_button() throws Throwable {

		List<WebElement> chkBx = driver.findElements(By.xpath("//*[@id='terms']"));
        //chkBx.get(0).click();
        chkBx.get(0).click();
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
