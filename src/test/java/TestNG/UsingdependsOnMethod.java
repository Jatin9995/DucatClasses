package TestNG;

import org.testng.annotations.Test;

public class UsingdependsOnMethod {
	
	@Test ()           //dependsOnmethod-is used used to set the priority. It is the second way of setting the priority.
	public void homepage() {
		System.out.println("Home-Page");
	}
	
	@Test(dependsOnMethods="homepage",priority=1, enabled = false)//enabled=false:-is used to stop the execution of any method
	public void searchpage() {
		System.out.println("Searc-Page");
	}
	
	@Test(dependsOnMethods="homepage",priority=2)
	public void loginpage() {
		System.out.println("Login-Page");
	}
	
	@Test(dependsOnMethods="loginpage")
	public void bookingpage() {
		System.out.println("Booking-Page");
	}

	@Test(dependsOnMethods="bookingpage")
	public void paymentpage() {
		System.out.println("Payment-Page");
	}

}
