package DucatClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtohandlewindowtable {

	public static void main(String[] args) {

		String CompanyName="Aryaman Financia";
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Cucumber_BDD_CI_CD\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Launch rediff.com
		driver.navigate().to("https://money.rediff.com/gainers");
		
		List<WebElement> alllist = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]"));
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		int count=alllist.size();
		
		
		for(int i=0; i<alllist.size();i++) {
		System.out.println(alllist.get(i).getText());
				
			
			}
		
///////////////////////**********************//////////////////////
		
		List<WebElement> companyname = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		System.out.println("Company names:-"+ companyname.size());
		System.out.println("Prices:-"+prices.size() );	
		
		for(int i=0;i<companyname.size();i++) {
			String name = companyname.get(i).getText();
			String amount = prices.get(i).getText();
			if(CompanyName.equals(name)) {
				System.out.println(name + "-----------"+ amount);
				break;
			}
		
		
	}

}
}
