package DucatClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingheadlessBrowser {

	public static void main(String[] args) {

		/* In real time when we merge our automation codes with CI/CD tools
		 * or integrate our codes with automation main branch
		 * then we mostly preferred headless browser to run our test
		 * its faster then real browser
		 * we can also take screenshots while run our test in headless browser
		 * there is a class chromeoptions which we can use to perform this activity
		 * by providing arguments
		 */
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");	

		//ChromeOptions class is used to perform headless browser activity
		ChromeOptions option=new ChromeOptions(); 
		//Argument for headlessbrowser
		option.addArguments("headless");
		WebDriver driver=new ChromeDriver(option);//need to add option in here to make the browser headless.
		driver.navigate().to("https://www.opencart.com/");
		String title = driver.getTitle();
		System.out.println("Title of the website:-"+ title);
	}

}
