package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {
	
	WebDriver driver;
	
		@Given("User is on Google Page")
		public void user_is_on_google_page() {
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.get("https://www.google.com/");
		}

		@When("User Search Java Tutorial")
		public void user_search_java_tutorial() {
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Java Tutorial");
	        searchBox.submit();
		}
		@Then("Should display Java Result Page")
		public void should_display_java_result_page() {
		  
	        Assert.assertEquals("Java Tutorial - Google Search",driver.getTitle());

		}
		@When("User Search selenium Tutorial")
		public void user_search_selenium_tutorial() {
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium Tutorial");
	        searchBox.submit();
		}
		@Then("Should display selenium Result Page")
		public void should_display_selenium_result_page() {
		  
	        Assert.assertEquals("Selenium Tutorial - Google Search",driver.getTitle());

		}
		@Then("close the browser")
		public void close_the_browser() {
		driver.close();
		}

		@After
		public void attachImage(Scenario scenario) throws IOException {
			if(scenario.isFailed()) {
				TakesScreenshot scr=(TakesScreenshot)driver;
				byte[] scrFile=scr.getScreenshotAs(OutputType.BYTES);
				//byte[] byteImg=FileUtils.readFileToByteArray(scrFile);
				scenario.attach(scrFile,"image/png", "image1");
			}
		}
}
