package StepDef;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginStepDef {
	static WebDriver driver;
	LoginPage login;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/login");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String uName, String pass) {
		login = new LoginPage(driver);
		login.enterUsername(uName);
		login.enterPassword(pass);
	}
	
	@When("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String uName, String pass) {
		login = new LoginPage(driver);
		login.enterUsername(uName);
		login.enterPassword(pass);
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
	   login.clickLoginButton();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.automationexercise.com/");
	    driver.findElement(By.xpath("//h2[contains(text(), 'Category')]")).isDisplayed();
	}
	
	@Then("User is logged in")
	public void user_is_logged_in() {
//	    Assert.assertEquals(driver., null);
	}
	
	@Then("Error message displayed correctly")
	public void error_message_displayed_correctly() {
		Assert.assertEquals(
				driver.findElement(
						By.xpath("//p[contains(text(), 'Your email or password is incorrect!')]")).isDisplayed(), 
				true);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	}

}
