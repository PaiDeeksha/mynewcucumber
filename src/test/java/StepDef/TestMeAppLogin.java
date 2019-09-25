package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeAppLogin {
	WebDriver driver=null;
	
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers_DP\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		Thread.sleep(1000);
	  
	}

	@When("^user enters lalitha as user name$")
	public void user_enters_lalitha_as_user_name() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		Thread.sleep(1000);
	    
	}

	@When("^user enters password(\\d+) as password$")
	public void user_enters_password_as_password(int arg1) throws Throwable {
		driver.findElement(By.id("password")).sendKeys("password123");
		Thread.sleep(1000);
	    
	}

	@Then("^user will find TestMeApp homepage$")
	public void user_will_find_TestMeApp_homepage() throws Throwable {
	   driver.findElement(By.name("Login")).click();
	   Thread.sleep(1000);
	   System.out.println("The title of the page is "+driver.getTitle());
	}


    @Then("^user clicks on SignOut to exit from the app$")
    public void user_clicks_on_SignOut_to_exit_from_the_app() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
    	Thread.sleep(1000);
    
}
}
