package StepDef;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
//	static WebDriver driver;
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.automationexercise.com/login");
//	}
//
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_and(String uName, String pass) {
//	    driver.findElement(By.xpath("(//input[@type='email' and @name='email'])[1]")).sendKeys(uName);
//	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
//	}
//	
//	@When("User enters invalid {string} and {string}")
//	public void user_enters_invalid_and(String uName, String pass) {
//		driver.findElement(By.xpath("(//input[@type='email' and @name='email'])[1]")).sendKeys(uName);
//	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
//	}
//
//	@When("Clicks on Login button")
//	public void clicks_on_login_button() {
//	   driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
//	}
//
//	@Then("User should navigate to homepage")
//	public void user_should_navigate_to_homepage() {
//		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.automationexercise.com/");
//	    driver.findElement(By.xpath("//h2[contains(text(), 'Category')]")).isDisplayed();
//	}
//	
//	@Then("Error message displayed correctly")
//	public void error_message_displayed_correctly() {
//		Assert.assertEquals(
//				driver.findElement(
//						By.xpath("//p[contains(text(), 'Your email or password is incorrect!')]")).isDisplayed(), 
//				true);
//	}
//
//	@Then("Close the browser")
//	public void close_the_browser() {
//	    driver.quit();
//	}

}
