package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='email' and @name='email'])[1]")
	WebElement txt_username;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[contains(text(), 'Login')]")
	WebElement btn_login;
	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		btn_login.click();
	}
	

}
