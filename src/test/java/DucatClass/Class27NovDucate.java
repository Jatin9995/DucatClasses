package DucatClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class27NovDucate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "J:\\\\\\\\eclipse_Jdrive\\\\\\\\Cucumber_BDD_CI_CD\\\\\\\\Chrome\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https:\\www.facebook.com");

		//to check whether the user id field is enabled or not on any website
		WebElement uid=driver.findElement(By.name("email"));//uid is a variable which we have created to save the return type elements/element
		boolean uidstatus=uid.isDisplayed(); //this method is used to find whether element is available or not.The return type is boolean.
		System.out.println(uidstatus);
				
		//to check whether the user id field is enabled or not on any website
		//we always crate an object to print. Without creating an object, you cannot print anything on console.

		boolean uidstate=uid.isEnabled();//The return type is boolean. in this we have created a variable and used retun type/ we have stored uid.isEnabled in uidstate
		System.out.println(uidstate);

		//isSelected method is used to find out whether the check box or radio button checked/unchecked or select/deselect
		//return type boolean

		Dimension uidsize = uid.getSize();// this method is used to get the height and width of an element on the webpage. Retun type is dimension class.

		//in above line we have store uid.getSize into a variable uidsize


		//to know the height and width of the dimension
		int uidheight=uidsize.height;
		int uidwidth=uidsize.width;
		System.out.println("Height="+ uidheight+ " and Width="+uidwidth);
		 
		//to know the location of the element means the x and y cordinate

		Point uidlocation = uid.getLocation();

		int uidX=uidlocation.x;
		int uidY=uidlocation.y;
		System.out.println("Uid x="+uidX+ " and Uid y="+ uidY);

		//to know the Css value like font, width, font-size

		String uidFont=uid.getCssValue("font-size");
		System.out.println("Css font size="+uidFont);

		String uidfamily=uid.getCssValue("font-family");
		System.out.println("Css font family=" +uidfamily);
		String uidWidth2=uid.getCssValue("width");
		System.out.println(uidWidth2);
		String uidcolor=uid.getCssValue("color");
		System.out.println("Uid color="+uidcolor);

		//to know the value of the attribute
		String uidAttribute=uid.getAttribute("placeholder");
		System.out.println("Attribute Value="+uidAttribute);

		uid.sendKeys("jatin9995@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TechMahindra@123");
		driver.findElement(By.name("login")).submit();

		
		
		
	}

		
		
	}


