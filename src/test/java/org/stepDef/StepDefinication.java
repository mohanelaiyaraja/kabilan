package org.stepDef;

import java.util.List;

import org.data.Baseclass;
import org.data.LoginPojo;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinication extends Baseclass{
	
	@Given("To Launch the chrome browser and hit the url")
	public void to_Launch_the_chrome_browser_and_hit_the_url() {
		
		chromeBrowser();
		launchPageurl("https://www.facebook.com/login/");
		pageTitle();
		currentUrl();
	   
	}

	@When("Enter the valid username in email field")
	public void enter_the_valid_username_in_email_field(io.cucumber.datatable.DataTable data) {
	
		List<String> as = data.asList();
		
		LoginPojo pojo = new LoginPojo();
		WebElement textemail = pojo.getTextemail();
		fillTextBox(textemail, as.get(2) );
	}

	@When("Enter the invalid password in Password field")
	public void enter_the_invalid_password_in_Password_field(io.cucumber.datatable.DataTable data) {
		
		List<List<String>> as = data.asLists();
	   
		LoginPojo pojo = new LoginPojo();
		WebElement textpass = pojo.getTextpass();
		fillTextBox(textpass, as.get(2).get(1));
		
	}

	@When("Click the login button")
	public void click_the_login_button() {
	    
		LoginPojo pojo = new LoginPojo();
		
		WebElement login = pojo.getLogin();
		btnClick(login);
		
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		
		closeBrowser();
	   
	}


}
