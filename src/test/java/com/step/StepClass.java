package com.step;

import com.BaseClass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.HomePage;

public class StepClass extends BaseClass {
	
	HomePage hp =  new HomePage();
	
	@Given("User Enter the Url {string}")
	public void user_enter_the_url(String string) {
		
		launchUrl(string);
		 
	}
	
	@When("User click on Women Tag")
	public void user_click_on_women_tag() {
		 hp.getElement1().click();
	}

	
	@When("User click on Women button")
	public void user_click_on_women_button() throws InterruptedException {
		Thread.sleep(3000);
		hp.actionMethod(hp.getElement2());
	}
	
@When("User Click on palazzos and Skirts")
public void user_click_on_palazzos_and_skirts() throws InterruptedException {
	Thread.sleep(3000);
	   hp.getElement3().click();	
    
}
@When("User Click on the Clora Creation")
public void user_click_on_the_clora_creation() throws InterruptedException {
	Thread.sleep(3000);
	   hp.getElement4().click();
    
}
@When("User Click on the size of the pant")
public void user_click_on_the_size_of_the_pant() throws InterruptedException {
	Thread.sleep(3000);
	   hp.getElement5().click();
}
@When("User Click on the Add to Cart button")
public void user_click_on_the_add_to_cart_button() throws InterruptedException {
	Thread.sleep(3000);
	hp.getElement6().click();
        
}
}