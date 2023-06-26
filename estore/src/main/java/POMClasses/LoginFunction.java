package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunction {
	
	@FindBy(xpath="//span[normalize-space()='My Account']")private WebElement Myaccount;
	@FindBy(xpath="//a[normalize-space()='Login']")private WebElement login_option;
	@FindBy(xpath="//input[@id='input-email']")private WebElement Username;
	@FindBy(xpath="//input[@id='input-password']")private WebElement password;
	@FindBy(xpath="//input[@value='Login']")private WebElement Login_button;
	
	
	
	public LoginFunction(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void input_myaccount() {
		Myaccount.click();
	}
	public void input_login_option() {
		login_option.click();	
	}
	public void input_username(String UI) {
		Username.clear();
		Username.sendKeys(UI);
	}
	public void input_password(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	public void input_Login_button() {
		Login_button.click();
	}


}
