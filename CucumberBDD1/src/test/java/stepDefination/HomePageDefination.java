package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageDefination {
	
	WebDriver driver;
	
	@Given("user on home page")
	public void user_on_home_page() {
	   
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters name & email")
	public void user_enters_name_email() {
	    
		driver.findElement(By.xpath("//input [@id='name']")).sendKeys("a");
		driver.findElement(By.xpath("//input [@id='email']")).sendKeys("b");
		
	}

	@Then("user is able to enter")
	public void user_is_able_to_enter() {
		driver.getCurrentUrl();
		driver.quit();
	}

	@When("user enter {string} annd {string}")
	public void user_enter_annd(String MoNo, String Date) {
		driver.findElement(By.xpath("//input [@id='mobile']")).sendKeys(MoNo);
		driver.findElement(By.xpath("//input [@id='dob']")).sendKeys(Date);
	}

	@Then("user is able to enter Mo & Date")
	public void user_is_able_to_enter_mo_date() {
		driver.getTitle();
		driver.quit();
	}

	@When("user enter {string}")
	public void user_enter(String subject) {
		driver.findElement(By.xpath("//input [@id='subjects']")).sendKeys(subject);
	}

	@And("user enters {string}")
	public void user_enters(String Add) {
		driver.findElement(By.xpath("//textarea [@id='picture']")).sendKeys(Add);
	}

	@Then("user is able to enter sub & Add")
	public void user_is_able_to_enter_sub_add() {
	   driver.close();
	}


}
