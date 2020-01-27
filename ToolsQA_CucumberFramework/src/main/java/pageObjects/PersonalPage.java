package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalPage {
	WebDriver driver;
	public PersonalPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	

@FindBy(how=How.CSS, using="#billing_first_name")
private WebElement firstname;
public void user_input_firstname_Faruq(String Fname) throws Throwable {
	firstname.sendKeys("Fname");
    }

@FindBy(how=How.CSS, using="#billing_last_name")
private WebElement lastname;
public void user_input_lastname_Molla(String Lname) throws Throwable {
	lastname.sendKeys(Lname);
    }

//@FindBy(how=How.XPATH, using="")
//private WebElement country;
public void user_input_country_Bangladesh(String Country) throws Throwable {
  System.out.println("working on county code. US is by default"); 
}
@FindBy(how=How.CSS, using="#billing_address_1")
private WebElement adress;
public void user_input_Street_address_S_th_rd(String Adress) throws Throwable {
	adress.sendKeys(Adress);
   
}

@FindBy(how=How.CSS, using="#billing_city")
private WebElement city;
public void user_input_Town_City_Arlington(String town) throws Throwable {
	city.sendKeys(town);
   }

@FindBy(how=How.XPATH, using="(//span[@class='select2-selection__rendered'])[2]")
private WebElement span;
@FindBy(how=How.XPATH, using="//li[text()='Alabama']")
private WebElement state;
@FindBy(how=How.CSS, using="#billing_postcode")
private WebElement postal;
public void user_input_State_VA(String post) throws Throwable {
	span.click();
	state.click();
	postal.sendKeys(post);
	
   }

@FindBy(how=How.CSS, using="#billing_phone")
private WebElement phone;
public void user_input_Phone(String Phone) {
	phone.sendKeys(Phone);
   }

@FindBy(how=How.CSS, using="#billing_email")
private WebElement email;
public void user_input_email_abc_gmail_com(String Email){
	email.sendKeys(Email);

}


}
