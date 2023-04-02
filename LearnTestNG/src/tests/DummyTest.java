package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class DummyTest {
	
	@Test
	
	public void dummy() {
		
		System.out.println("Hi i 'm here");
	}
	
	@AfterTest
	public void endScript() {
		System.out.println("I'll execute last");
	}

}
