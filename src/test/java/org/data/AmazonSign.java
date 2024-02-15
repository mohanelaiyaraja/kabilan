package org.data;

import java.util.List;

import org.data.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.PageFactory;

public class AmazonSign extends Baseclass {
	
	public AmazonSign() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement mobile;
	
	@FindBy(id="continue")
	private WebElement contin;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement pass;
	
	/*@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signup;*/
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submit;
		
	
	
	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getSubmit() {
		return submit;
	}

	

	public WebElement getContin() {
		return contin;
	}
	
	public WebElement getPass() {
		return pass;
	}

	
	
	
	
	

}
