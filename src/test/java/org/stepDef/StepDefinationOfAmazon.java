package org.stepDef;

import org.data.AmazonSign;
import org.data.Baseclass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinationOfAmazon extends Baseclass {

	@Given("To lunch the browser and hit the url")
	public void to_lunch_the_browser_and_hit_the_url() {
	    chromeBrowser();
	    launchPageurl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAq4KuBhA6EiwArMAw1CDlg1i4JRNFtTxjHCEQ-7zzxI1ZqlnZRkWRqHiO7WblznVj_BIkShoC2pUQAvD_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061916%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D16990276532664102329%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26ie%3DUTF8%26index%3Daps%26keywords%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_e%26tag%3Dgooginhydr1-21%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    currentUrl();
	}

	@When("To enter the valid password of email field")
	public void to_enter_the_valid_password_of_email_field() {
	    AmazonSign pojo = new AmazonSign();
	    WebElement mobile = pojo.getMobile();
	    fillTextBox(mobile, "7397553910");
	    
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		AmazonSign pojo = new AmazonSign();
		WebElement contin = pojo.getContin();
		btnClick(contin);
	}

	@When("To enter the valid password of password filed")
	public void to_enter_the_valid_password_of_password_filed() {
		AmazonSign pojo = new AmazonSign();
		WebElement pass = pojo.getPass();
		fillTextBox(pass, "@1223456");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		AmazonSign pojo = new AmazonSign();
		WebElement submit = pojo.getSubmit();
		btnClick(submit);
	}

	
}
