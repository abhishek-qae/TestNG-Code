package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DummyTest {
	
	
	@BeforeTest
	public void setupBrowser() {
		
		System.out.println("Chrome Launched");
	}
	
	@Test(groups= {"smoke"})
	public void dummy() {
		
		System.out.println("Hi i 'm here");
	}
	

	
	@AfterTest
	public void turnDown() {
		System.out.println("Quit Browser");
	}

}
