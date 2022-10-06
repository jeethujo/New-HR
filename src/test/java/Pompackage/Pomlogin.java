package Pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseHRMClass;

public class Pomlogin extends BaseHRMClass {

	//object repository
	@FindBy(id="txtUsername")

WebElement Username;
	@FindBy(id="txtPassword") WebElement Password;
	
	@FindBy(id="btnLogin") WebElement Loginbtn;
	//initiate page elements
	
	public Pomlogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void typeusername(String name) {
	Username.sendKeys(name);
		
	}

public void typepassword(String pass) {
	Password.sendKeys(pass);
}
public void clickbtn() {
	Loginbtn.click();
}

// adding one more method to verify the title of the page

public String verify() {
	return driver.getTitle();
}
}
