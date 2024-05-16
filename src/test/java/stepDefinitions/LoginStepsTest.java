package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginStepsTest {
	public WebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	     driver = new ChromeDriver();	     
	}

	@Given("Navigate to Opencart URL")
	public void navigate_to_opencart_url() {
		driver.get("http://localhost/opencart/upload/index.php?route=account/login&language=en-gb");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@When("enter user name and Password")
	public void enter_user_name_and_password() {
	    driver.findElement(By.cssSelector("#input-email")).sendKeys("bvnrtraining@gmail.com");
	    driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.cssSelector("[type='Submit']")).click();
	}

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
	    boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
	    Assert.assertEquals(status, true);
	}
	
	@Then("Logout from OpenCart application")
	public void logout_from_open_cart_application() {
		driver.findElement(By.xpath("//div[contains(@class,'list-group')]/a[text()='Logout']")).click();
		boolean status = driver.findElement(By.xpath("//h1[text()='Account Logout']")).isDisplayed();
	    Assert.assertEquals(status, true);
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    driver.quit();
	}
	@Then("User should validate expected message is displayed")
	public void user_should_validate_expected_message_is_displayed() {
	   
	}
	
}
