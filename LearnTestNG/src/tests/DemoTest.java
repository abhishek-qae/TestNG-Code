package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoTest {
	
	
	@Test
	public void demo() {
		
		System.out.println("Hello World");
	}
	
	@Test
	public void demo2() {
		
		System.out.println("Hello TestNG");
	}
	
	@BeforeTest
	public void preReq() {
		
		System.out.println("I'll execute first");
	}

}
