package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = ".noo-search") 
	private WebElement searchButton;
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	@FindBy(how = How.XPATH, using = "//input[@type='search']") 
	private WebElement Dress;
	
	public void user_want_to_search_for_Dress () {
		Dress.sendKeys("dress");
		 Actions act = new Actions(driver);
	     act.sendKeys(Keys.ENTER).perform();
	        	}
	@FindBy(how=How.XPATH, using="//a[contains(text(),'white milkmaid hook and eye bodycon midi dress')]")
	private WebElement whiteDress; 
	public void whiteDress() {
		whiteDress.click();
	
	}
	@FindBy(how=How.ID,using="pa_color")
	private WebElement white;
	
	public void user_choose_color_White() throws Throwable {
		//WebElement element = white;
				//driver.findElement(By.id("pa_color"));
		Select color = new Select(white);
	   // day.selectByIndex(19);
	    //day.selectByVisibleText("");
		color.selectByValue("white");
	
		//Thread.sleep(3000);

	    
	}
	
	@FindBy(how=How.ID, using="pa_size")
	private WebElement size;
	public void user_choose_size_Small() throws InterruptedException {
		Select medium = new Select(size);
		medium.selectByValue("medium");
	   Thread.sleep(1000);
	}
	@FindBy(how=How.XPATH, using="//*[@class='icon_plus']")
	private WebElement quantity;
	public void user_choose_QTY() {
		quantity.click();
	}
	
	

}
