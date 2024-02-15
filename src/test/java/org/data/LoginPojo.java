package org.data;

import org.data.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Baseclass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id="email")
	private WebElement textemail;
	
	@FindBy(id="pass")
	private WebElement textpass;
	
	@FindBy(name ="login")
	private WebElement login;
	
	

	public WebElement getTextemail() {
		return textemail;
	}

	public WebElement getTextpass() {
		return textpass;
	}

	public WebElement getLogin() {
		return login;
	}

}
