package tests;


import org.testng.annotations.Test;


public class DemoTest {
	
	
	@Test(groups={"smoke"})
	public void demo() {
		
		System.out.println("Hello World");
	}
	
	@Test
	public void demo2() {
		
		System.out.println("Hello TestNG");
	}
	
	

}
