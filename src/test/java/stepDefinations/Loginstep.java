package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginstep {
	
	WebDriver driver;

	@Given("the user should open the application")
	public void the_user_should_open_the_application() 
	{
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
		
	}

	@Given("the user is on the NopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		
	}

	@When("the user enter the valid credentials \\(username: {string} , password: {string})")
	public void the_user_enter_the_valid_credentials_username_password(String email, String pwd) 
	{
	    
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	}

	@When("the user clicked on Login button")
	public void the_user_clicked_on_login_button() 
	{
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}

	@Then("the user should be redirected to the My Account Page")
	public void the_user_should_be_redirected_to_the_my_account_page() 
	{
		boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
		
		Assert.assertEquals(status, true);
	}

	@Then("the user should see the Welcome message")
	public void the_user_should_see_the_welcome_message() 
	{
		
		boolean welcomestatus =  driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).isDisplayed();
	    
		Assert.assertEquals(welcomestatus, true);
		driver.quit();
	}

	
	
}
