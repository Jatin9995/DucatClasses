package DucatClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class27Nov_Ducatemultiele {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "J:\\\\eclipse_Jdrive\\\\Cucumber_BDD_CI_CD\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.navigate().to("https:\\www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//to know the count of hyper link available on the website
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		int Totallinks=allLinks.size();
		System.out.println("Total links on website="+Totallinks);
		
		for(int i=0;i<Totallinks;i++) {
			
		String myLinks=allLinks.get(i).getText();
		//String myLinks2=allLinks.get(i).getAttribute("href");
		
		System.out.println(myLinks);
	//	System.out.println(myLinks2);
			
		}
		
		
		driver.close();
		
		

	}

}
