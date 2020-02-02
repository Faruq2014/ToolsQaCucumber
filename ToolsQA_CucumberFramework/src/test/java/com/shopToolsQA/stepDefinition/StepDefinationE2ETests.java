package com.shopToolsQA.stepDefinition;

import com.shopToolsQA.Hooks.Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectsE2E.CartPage;
import pageObjectsE2E.HomePage;
import pageObjectsE2E.PersonalPage;
import pageObjectsE2E.PlaceOrderPage;
import pageObjectsE2E.ProductListingPage;

public class StepDefinationE2ETests extends Hooks{
	
	@Before()
	public void openTest() {
		System.out.println("Opening test");
	}

	@After()
	public void tearDownTest() {
		System.out.println("Closing test");

		//driver.quit();
	}


@Given("^launch the application in \"([^\"]*)\"$")
public void launch_the_application_in(String Browser) throws Throwable {
	

	if(Browser.equalsIgnoreCase("GC"))
	{
		Hooks.Chrome_launch();
	}
	if(Browser.equalsIgnoreCase("FF"))
	{
		Hooks.Firefox_launch();
	}
	/*
	if(Browser.equalsIgnoreCase("IE"))
	{
		Hooks.IE_launch();
	}
*/
   
}
@Given("^User go to web application$")
public void user_go_to_web_application() throws Throwable {
	HomePage hp = new HomePage(driver);
	hp.navigateToHomePage();
	//driver.get("http://www.shop.demoqa.com");
	
}


@When("^User want to search for Dress$")
public void user_want_to_search_for_Dress() throws Throwable {
	ProductListingPage plp = new ProductListingPage(driver);
	                   plp.clickOnSearchButton();
	                   plp.user_want_to_search_for_Dress();
}
@When("^User want to buy the first item$")
public void user_want_to_buy_the_first_item() throws Throwable {
	ProductListingPage plp = new ProductListingPage(driver);
	plp.whiteDress();
   

}

@When("^User choose color White$")
public void user_choose_color_White() throws Throwable {
	ProductListingPage plp = new ProductListingPage(driver);
	plp.user_choose_color_White();
   
}

@When("^User choose size Small$")
public void user_choose_size_Small() throws Throwable {
	ProductListingPage plp = new ProductListingPage(driver);
	plp.user_choose_size_Small();

    
}

@When("^User choose QTY (\\d+)$")
public void user_choose_QTY(int arg1) throws Throwable {
	ProductListingPage plp = new ProductListingPage(driver);
	plp.user_choose_QTY();
}

@When("^User add the product to the Cart$")
public void user_add_the_product_to_the_Cart() throws Throwable {
	CartPage cp = new CartPage(driver);
	cp.user_add_the_product_to_the_Cart();
}

@When("^user click on Cart$")
public void user_click_on_Cart() throws Throwable {
	CartPage cp = new CartPage(driver);
	cp.user_click_on_Cart();
}

@When("^User click on Proced to Checkout$")
public void user_click_on_Proced_to_Checkout() throws Throwable {
	CartPage cp = new CartPage(driver);
	cp.user_click_on_Proced_to_Checkout();
}

@When("^user input firstname Faruq$")
public void user_input_firstname_Faruq() throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_firstname_Faruq("Faruq");
    }

@When("^user input lastname Molla$")
public void user_input_lastname_Molla() throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_lastname_Molla("Molla");
    }

@When("^user input country Bangladesh$")
public void user_input_country_Bangladesh() throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_country_Bangladesh("US");
   
}

@When("^user input Street address (\\d+) S (\\d+)th\\. rd\\.$")
public void user_input_Street_address_S_th_rd(int arg1, int arg2) throws Throwable {
	PersonalPage pp= new PersonalPage(driver); 
	pp.user_input_Street_address_S_th_rd("8103 pinelake ct");
}

@When("^user input Town/City Arlington$")
public void user_input_Town_City_Arlington() throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_Town_City_Arlington("alexandria");
   }

@When("^user input State  VA$")
public void user_input_State_VA() throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_State_VA("22330");
   }

@When("^user input Phone (\\d+)$")
public void user_input_Phone(int arg1) throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_Phone("2223334444");
   }

@When("^user input email abc@gmail\\.com$")
public void user_input_email_abc_gmail_com() throws Throwable {
	PersonalPage pp= new PersonalPage(driver);
	pp.user_input_email_abc_gmail_com("aaa@gmail.com");

}

@When("^user select on agreed  button$")
public void user_select_on_agreed_button() throws Throwable {
	PlaceOrderPage pop= new PlaceOrderPage(driver);
	pop.user_select_on_agreed_button();
   }

@When("^user click on Place order$")
public void user_click_on_Place_order() {
	PlaceOrderPage pop= new PlaceOrderPage(driver);
	pop.user_click_on_Place_order();
}

@Then("^user will find order confirmation page$")
public void user_will_find_order_confirmation_page() throws Throwable {
  System.out.println("need a verification"); }

@Then("^user will find thank you message$")
public void user_will_find_thank_you_message() throws Throwable {
	PlaceOrderPage pop= new PlaceOrderPage(driver);
	pop.user_will_find_thank_you_message();
    
}

@Then("^user will find order number$")
public void user_will_find_order_number() {
	PlaceOrderPage pop= new PlaceOrderPage(driver);
	pop.user_will_find_order_number();
    
}

	




}
