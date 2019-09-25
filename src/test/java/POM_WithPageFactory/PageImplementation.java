package POM_WithPageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.PageClass;

public class PageImplementation {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers_DP\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageClass_1 locateElements= PageFactory.initElements(driver, PageClass_1.class);
		locateElements.loginMethod("aravind.guggilla57@gmail.com","aravind");
	}

}
