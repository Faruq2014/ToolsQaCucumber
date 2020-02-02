package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(	WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
@FindBy(how=How.XPATH, using="//a[text()='Dismiss']")
private WebElement dismis;

@FindBy(how=How.XPATH, using="//a[text()='My Account']")
private WebElement myAccount;

@FindBy(how=How.CSS, using="#username")
private WebElement Username;

@FindBy(how=How.CSS, using="#password")
private WebElement Password;

@FindBy(how=How.CSS, using=".login")
private WebElement loginButton;

public void user_enter_valid_username()  {
	dismis.click();
	myAccount.click();
	Username.sendKeys("faruq");
    }

public void user_enter_valid_password() {
	Password.sendKeys("Libiandfaruq");  
}


public void click_on_submit_button() {
	loginButton.click();
    }


public void user_should_have_home_page() {
    String Title= driver.getTitle();
    System.out.println("valid login title is----"+Title);
}



public void user_enter_invalidUName(String username)  {

	dismis.click();
	myAccount.click();
	Username.sendKeys(username);
    
	
    }

public void user_enter_invalidPWord(String password) {

	Password.sendKeys(password);  

   }
public void click_on_submit_button_for_negative_test()  {

	loginButton.click();
    	   
}



public void user_should_have_landing_page() {

    String Title= driver.getTitle();
    System.out.println("Invalid login title is----"+Title);

    }



}
