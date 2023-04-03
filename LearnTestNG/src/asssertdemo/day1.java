package asssertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void asrtDemo() {
		
		Assert.assertEquals("selenium", "selenium"); //passed
		Assert.assertTrue(true); //passed
		System.out.println("All script passed");
	}

}
