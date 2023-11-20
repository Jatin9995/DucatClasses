package TestNG;

import org.testng.annotations.Test;

public class usingGroupwise2 {
	
@Test(groups= {"Functional Testing"})
	
	public void Verifytitle() {
		
		System.out.println("Tile-Functional Testing");
		
	}
	
	@Test(groups= {"Smoke Testing"})
	public void VerifyURL() {
		System.out.println("AppURL-Smoke Testing");
	}
	
	@Test(groups= {"Sanity Testing"})
	public void Checklogo() {
		System.out.println("Verify logo-Sanity Testing");
	}
	
	@Test(groups= {"Smoke Testing"})
	public void checkLogin() {
		System.out.println("Veryfy login-Smoke Testing");
	}

}
