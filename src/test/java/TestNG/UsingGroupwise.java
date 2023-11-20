package TestNG;

import org.testng.annotations.Test;

public class UsingGroupwise {
	
	//in group wise method, we need to use <groups>
	//<run> below the suit name in xml file and also have to proide the name of the group which you want to run in xml file from testng class.
	//using eg:-<include name="functional testing"></include> .Group name can be anything. its is not mandatory to mention testing type. group name can be software company, automobile company etc.
	
	@Test  (groups={"Functional Testing"})         
	public void homepage() {
		System.out.println("Home-Page"    + "Functional Testing");
	}
	
	@Test (groups= {"Sanity Testing"})
	public void searchpage() {
		System.out.println("Searc-Page"   +  "Sanity Testing");
	}
	
	@Test (groups= {"Smoke Testing"})
	public void loginpage() {
		System.out.println("Login-Page"   +  "Smoke Testing");
	}
	
	@Test(groups= {"Functional Testing"})
	public void bookingpage() {
		System.out.println("Booking-Page"   +  "Functional Testing");
	}

	@Test (groups= {"Sanity Testing"})
	public void paymentpage() {
		System.out.println("Payment-Page"   +  "Sanity Testing");
	}
	

}
