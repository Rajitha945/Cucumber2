package com.StepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Steps {
	static WebDriver driver;
	@Given("Use is in the Add Customer Page")
	public void use_is_in_the_Add_tarrif_plan_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber2\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("Click on Add Customer page")
	public void use_is_in_the_Add_Customer_Page() {
	   WebElement tarrif = driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]"));
	   tarrif.click();
	   
	}

	/*@When("Fill the details")
	public void fill_the_details() {
        driver.findElement(By.xpath("//label[@for='done']")).click();;
        driver.findElement(By.id("fname")).sendKeys("Rajitha");
        driver.findElement(By.id("lname")).sendKeys("Kataru");
        driver.findElement(By.id("email")).sendKeys("rajithak945@gmail.com");
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Nellore");
        driver.findElement(By.id("telephoneno")).sendKeys("7338979855");
	}*/
	
	@When("Fill the detailss")
	public void fill_the_detailss(DataTable dataTable) {
		List<String> CustomerDetails = dataTable.asList(String.class);
        driver.findElement(By.xpath("//label[@for='done']")).click();;
        driver.findElement(By.id("fname")).sendKeys(CustomerDetails.get(0));
        driver.findElement(By.id("lname")).sendKeys(CustomerDetails.get(1));
        driver.findElement(By.id("email")).sendKeys(CustomerDetails.get(2));
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(CustomerDetails.get(3));
        driver.findElement(By.id("telephoneno")).sendKeys(CustomerDetails.get(4));
	}
	@When("Fill the detailse")
	public void fill_the_detailse(DataTable dataTable) {
        Map<String,String> CustomerDetail = dataTable.asMap(String.class,String.class);
        driver.findElement(By.xpath("//label[@for='done']")).click();;
        driver.findElement(By.id("fname")).sendKeys(CustomerDetail.get("fName"));
        driver.findElement(By.id("lname")).sendKeys(CustomerDetail.get("lName"));
        driver.findElement(By.id("email")).sendKeys(CustomerDetail.get("email"));
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(CustomerDetail.get("Address"));
        driver.findElement(By.id("telephoneno")).sendKeys(CustomerDetail.get("Phno"));
	}
	
	@When("Fill the details {string},{string},{string},{string},{string}")
	public void fill_the_detailss(String string, String string2, String string3, String string4, String string5) {
        driver.findElement(By.xpath("//label[@for='done']")).click();;
        driver.findElement(By.id("fname")).sendKeys(string);
        driver.findElement(By.id("lname")).sendKeys(string2);
        driver.findElement(By.id("email")).sendKeys(string3);
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(string4);
        driver.findElement(By.id("telephoneno")).sendKeys(string5);
	}
	/*@When("Fill the detailss")
	public void fill_the_detailss(DataTable dataTable) {
     List<String> tarrifPlans =  dataTable.asList(String.class);
     driver.findElement(By.id("rental1")).sendKeys(tarrifPlans.get(0));
     driver.findElement(By.id("local_minutes")).sendKeys(tarrifPlans.get(1));
     driver.findElement(By.id("inter_minutes")).sendKeys(tarrifPlans.get(2));
     driver.findElement(By.id("sms_pack")).sendKeys(tarrifPlans.get(3));
     driver.findElement(By.id("minutes_charges")).sendKeys(tarrifPlans.get(4));
     driver.findElement(By.id("inter_charges")).sendKeys(tarrifPlans.get(5));
     driver.findElement(By.id("sms_charges")).sendKeys(tarrifPlans.get(6));
	}*/

	@When("click on submit button")
	public void click_on_submit_button() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

	@Then("validate the successfull message is displayed")
	public void validate_the_successfull_message_is_displayed() {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
	}



}
