package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Registerstep {

	WebDriver driver;
	
	@Given("the user should be on register page")
	public void the_user_should_be_on_the_application() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}
	
	@When("the user should click on male radio button")
	public void the_user_should_click_on_male_radio_button() 
	{
	    
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
	}

	@When("the user enter valid first name \\(first name = {string})")
	public void the_user_enter_valid_first_name_first_name(String fname) 
	{
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fname);
	}

	@When("the user enter valid last name \\(last name = {string})")
	public void the_user_enter_valid_last_name_last_name(String lname) 
	{
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lname);
	}

	@When("the user select the valid date of dateofbirth \\(date = {string})")
	public void the_user_select_the_valid_date_of_dateofbirth_date(String date) 
	{
		WebElement datedpEle = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		
		// Select the one of the options from the drop down
		
		Select datedp = new Select(datedpEle);
		
		datedp.selectByVisibleText(date);
	}

	@When("the user select the valid month of dateofbirth \\(month = {string})")
	public void the_user_select_the_valid_month_of_dateofbirth_month(String month) 
	{
		WebElement monthdpEle = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		
		Select monthdp = new Select(monthdpEle);
		
		monthdp.selectByVisibleText("Septempber");
		
	}

	@When("the user select the valid year of the dateofbirth \\( year = {string})")
	public void the_user_select_the_valid_year_of_the_dateofbirth_year(String year) 
	{
	   
		WebElement yeardpEle = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		
		Select yeardp = new Select(yeardpEle);
		
		yeardp.selectByVisibleText(year);
		
	}

	@When("the user enter the valid email \\(email = {string})")
	public void the_user_enter_the_valid_email_email(String email) 
	{
	    
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		
	}

	@When("the user enter the company name \\(company name = {string})")
	public void the_user_enter_the_company_name_company_name(String company) 
	{
	    
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(company);
	}

	@When("the user should enter valid password \\(password = {string})")
	public void the_user_should_enter_valid_password_password(String pwd) 
	{
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		
	}

	@When("the user should enter valid confirm password \\( password = {string})")
	public void the_user_should_enter_valid_confirm_password_password(String confpwd) 
	{
	    
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confpwd);
		
	}

	@When("the user should click on register button")
	public void the_user_should_click_on_register_button() 
	{
	    
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		
	}

	@Then("the user should redirected to the My Account page")
	public void the_user_should_redirected_to_the_my_account_page() 
	{
		boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
		
		Assert.assertEquals(status, true);
		
	}

	@Then("the user should see the Register name")
	public void the_user_should_see_the_register_name() 
	{
		boolean registatus = driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed();
	
	    Assert.assertEquals(registatus,true);
	}

	
	
}
