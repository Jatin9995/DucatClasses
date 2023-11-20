package DucatClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {


		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Launch opencart.com
		driver.navigate().to("https://www.opencart.com/");
		
	driver.findElement(By.xpath("//img[@src='application/view/image/home/brand/concordia-college.png']")).click();
	
	String Parentwinid = driver.getWindowHandle();
	System.out.println("Parent Window ID:-" + Parentwinid);
	
	//get window handles is used when we want to switch to another window.
	Set<String> allwin = driver.getWindowHandles();
	System.out.println(allwin.size());
	
	//Iterator is used to move one window to another window.
	Iterator<String> itr = allwin.iterator();
	while(itr.hasNext()) {    //hasnext is used to return bollean if the .next has an element in window.
		String childwin = itr.next();   //next here means child window that is why created a childwin variable.
		if(!Parentwinid.equals(childwin)) {    //! = this means not
			
			driver.switchTo().window(childwin);
			String title=driver.getTitle();
			System.out.println("Child window title:-" + title);
			driver.findElement(By.xpath("//a[@href='https://shop.concordia-ny.edu/index.php?route=account/account']")).click();
			driver.close(); //this will only close the child window
			
		}
		
	}
	
	driver.switchTo().window(Parentwinid); // this wil switch the windlow handle from child to parent
	System.out.println("Title of Parent Window:-"+ driver.getTitle());
	driver.quit();//this will close child as well as parent window.
	

		
		
	}

}
