package stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
	
		@Given("User is on login page")
		public void user_is_on_login_page() {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("http://the-internet.herokuapp.com/login");
		}
		
			@When("User enters Login credentials")
			public void user_enters_login_credentials() {
				driver.findElement(By.name("username")).sendKeys("tomsmith");
				   driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
				   driver.findElement(By.cssSelector(".radius")).click();
 
			}



			
			@When("User enters {string} and {string}")
			public void user_enters_and(String strUser, String strPwd) {
				driver.findElement(By.name("username")).sendKeys(strUser);
				   driver.findElement(By.name("password")).sendKeys(strPwd);
				   driver.findElement(By.cssSelector(".radius")).click();
			}

		



		@Then("User is on Home page")
		public void user_is_on_home_page() {
		    boolean isValidUser =driver.findElement(By.cssSelector("div.success")).isDisplayed();
		    Assert.assertTrue(isValidUser);
		}



}