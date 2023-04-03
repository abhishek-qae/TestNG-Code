package asssertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void asrtDemo() {
		
		Assert.assertTrue(true); //passed
		Assert.assertEquals("Welcome", "welcome"); //failed 
		Assert.assertEquals("selenium", "selenium"); // passed 
		System.out.println("All script passed");
	}

}
