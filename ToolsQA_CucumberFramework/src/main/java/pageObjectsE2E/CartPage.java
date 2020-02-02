package pageObjectsE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[2]")
	private WebElement submit;
	public void user_add_the_product_to_the_Cart() {
		submit.click();
	}
	
	@FindBy(how=How.XPATH, using="//span[@class='cart-item has-items']")
	public WebElement cart;
	public void user_click_on_Cart() {
   // driver.findElement(By.xpath("//span[@class='cart-item has-items']")).click();
		cart.click();
              }
	@FindBy(how=How.XPATH, using="//a[@class='checkout-button button alt wc-forward']")
	private WebElement checkout;
	public void user_click_on_Proced_to_Checkout() {
		checkout.click();
	//  driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
	}

}
