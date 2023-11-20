package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforM_AfterM {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void intiBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
	}
	
	@Test  //test case 1
	public void ValidLogin() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	
	@Test //test case 2
	public void InvalidLogin() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user-name")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@AfterMethod
	
	public void CloseWindow() {
		driver.close();
	}
	

}
