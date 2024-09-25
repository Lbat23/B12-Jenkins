package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStep {

	WebDriver driver;

	@Given("User navigates to login page {string}")
	public void user_navigates_to_login_page(String url) throws InterruptedException {
		System.out.println("Navigating to application");
		System.out.println("SMOKETEST4");

		// Mac Users
//		WebDriverManager.safaridriver().setup();
//		driver = new SafariDriver();
//		

		// Firefox Window User
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();

		// Edge-WIndows User
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();

	//	Thread.sleep(2000);
		//driver.manage().window().maximize();
		//driver.get(url);
		//Thread.sleep(2000);

		//System.out.println("Test");
		//System.out.println("Test");
		//System.out.println("Test");
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
		System.out.println("Entering Username");
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		System.out.println("Entering Password");	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		System.out.println("Clicking login button");
	}

	@Then("System redirects to dashboard page {string}")
	public void system_redirects_to_dashboard_page(String pageHeader) throws InterruptedException {
		System.out.println("Pageheader text");
	}

	@Then("System redirects to dashboard pages {string}")
	public void system_redirects_to_dashboard_pages(String string) {
		System.out.println("Dashboard page");

		System.out.println("DONEEEEEEEE...");
	}
}
