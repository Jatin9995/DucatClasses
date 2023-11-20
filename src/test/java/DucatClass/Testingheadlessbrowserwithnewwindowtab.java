package DucatClass;


import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testingheadlessbrowserwithnewwindowtab {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
	//	driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String Title = driver.getTitle();
		System.out.println(" First Page Title "  +  Title);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");

		System.out.println("Second window title" + driver.getTitle());

Set<String> allwin = driver.getWindowHandles();

List<String> handles = new ArrayList<String>();
handles.addAll(allwin);
driver.close();


driver.switchTo().window(handles.get(0));
System.out.println("Again first window title" + driver.getTitle());





	}

}
