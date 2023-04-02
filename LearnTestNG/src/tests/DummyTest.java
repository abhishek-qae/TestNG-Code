package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DummyTest {
	
	
	@BeforeMethod
	public void setupBrowser() {
		
		System.out.println("Chrome Launched");
	}
	
	@Test
	public void dummy() {
		
		System.out.println("Hi i 'm here");
	}
	

	
	@AfterMethod
	public void turnDown() {
		System.out.println("Quit Browser");
	}

}
