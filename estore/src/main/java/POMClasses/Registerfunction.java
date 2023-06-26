package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerfunction {
	
	@FindBy(xpath="//span[normalize-space()='My Account']")private WebElement myaccount;
	@FindBy(xpath="//a[normalize-space()='Register']")private WebElement register;
	@FindBy(xpath="//input[@id='input-firstname']")private WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")private WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']")private WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")private WebElement phone;
	@FindBy(xpath="//input[@id='input-password']")private WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")private WebElement confirm_password;
	@FindBy(xpath="//label[normalize-space()='Yes']//input[@name='newsletter']")private WebElement newsletter;
	@FindBy(xpath="//input[@name='agree']")private WebElement privacy_policy;
	@FindBy(xpath="//input[@value='Continue']")private WebElement continue_button;
	
	
	public Registerfunction(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
		public void inputmyaccount() {
			myaccount.click();
			
		}
		public void inputregister() {
			register.click();	
		}
		public void inputfirstname() {
			firstname.clear();
			firstname.sendKeys("estore");;
		}
		public void inputlastname() {
			lastname.clear();
			lastname.sendKeys("com");
		}
		public void inputemail() {
			email.clear();
			email.sendKeys("estorecom@gmail.com");
		}
		public void inputphone() {
			phone.clear();
			phone.sendKeys("123");
		}
		public void inputpassword() {
			password.clear();
			password.sendKeys("abcdef");
		}
		public void inputconpassword() {
			confirm_password.clear();
			confirm_password.sendKeys("ebcdef");
		}
		public void inputnewsletter() {
			newsletter.click();
			
		}
		public void inputprivacy() {
			privacy_policy.click();
			
		}
		public void inputcontinuebutton() {
			continue_button.click();
		}
			

}
