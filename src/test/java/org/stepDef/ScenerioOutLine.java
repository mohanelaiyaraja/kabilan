package org.stepDef;

import org.data.Baseclass;
import org.data.LoginPojo;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenerioOutLine extends Baseclass{
	
	

@Given("To hit the chorome Browser and hit the url")
public void to_hit_the_chorome_Browser_and_hit_the_url() {
    chromeBrowser();
    launchPageurl("https://www.facebook.com/login/");
    pageTitle();
    currentUrl();
    maxWindow();
}

@When("Enter the valid username {string} in email field")
public void enter_the_valid_username_in_email_field(String value) {
   LoginPojo pojo = new LoginPojo();
   WebElement textemail = pojo.getTextemail();
   fillTextBox(textemail, value);
}

@When("Enter the Valid {string} password in password field")
public void enter_the_Valid_password_in_password_field(String value) {
	LoginPojo pojo = new LoginPojo();
	WebElement textpass = pojo.getTextpass();
	fillTextBox(textpass, value);
}

@When("Click the Login button")
public void click_the_Login_button() {
	LoginPojo pojo = new LoginPojo();
	WebElement login = pojo.getLogin();
	btnClick(login);
}

@Then("To close the browser")
public void to_close_the_browser() {
    closeBrowser();
}


}
