package com.shopToolsQA.stepDefinition;

import com.shopToolsQA.Hooks.Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObjectsE2E.HomePage;

public class StepDefinationLoginTests extends Hooks{
	
//https://www.youtube.com/watch?v=6uDmzNQ0cUY  
	// for extend report
	@Before()
	public void openTest() {
		System.out.println("Opening test");
	}

	@After()
	public void tearDownTest() {
		System.out.println("Closing test");

		driver.quit();
	}



@Given("^user open browser$")
public void user_open_browser() throws Throwable {
   Hooks.Chrome_launch();
}

@When("^user enter url$")
public void user_enter_url() throws Throwable {
	HomePage hp = new HomePage(driver);
	hp.navigateToHomePage();
	//driver.get("http://www.shop.demoqa.com");
	
}

@Then("^user should open landing page$")
public void user_should_open_landing_page() throws Throwable {
  String ExpectedTitle = driver.getTitle();
  System.out.println(ExpectedTitle);
  String ActualTitle="ToolsQA Demo Site – ToolsQA – Demo E-Commerce Site\r\n" + 
  		"";
  if(ExpectedTitle.equalsIgnoreCase(ActualTitle)) {
	  System.out.println("we are on ToolsQA site ");
  }else{
	System.out.println("we are on wrong site");  
  }
  
}

@When("^user enter valid username$")
public void user_enter_valid_username() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.user_enter_valid_username();
    }

@When("^user enter valid  password$")
public void user_enter_valid_password() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.user_enter_valid_password();

}

@When("^click on submit button$")
public void click_on_submit_button() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.click_on_submit_button();

    }

@Then("^user should have home page$")
public void user_should_have_home_page() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.user_should_have_home_page();
  
}

@When("^user enter invalid \"([^\"]*)\"$")
public void user_enter_invalidUName(String username) throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.user_enter_invalidUName(username);

    }

@When("^user enter invalid  \"([^\"]*)\"$")
public void user_enter_invalidPWord(String password) throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.user_enter_invalidPWord(password);

   }

@When("^click on submit button for negative test$")
public void click_on_submit_button_for_negative_test() throws Throwable {
	LoginPage lp = new LoginPage(driver);
lp.click_on_submit_button_for_negative_test();
   
}


@Then("^user should have landing page$")
public void user_should_have_landing_page() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.user_should_have_landing_page();

    }



}
