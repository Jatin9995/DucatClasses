package TestNG;

import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@Test(priority=1)//priority is used to change the execution of the test
	public void homepage() {  //method used under test class--syntax:-access modifier return type method name(list of parameters)
		
		System.out.println("Home-Page");
	}
	
	@Test(priority=3)
	public void searchpage() {
		System.out.println("Search-Page");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Login");
		
	}


}
