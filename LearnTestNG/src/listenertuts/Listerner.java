package listenertuts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Listerner {
	
	@Test
	public void loginByFacebook() {
		
		System.out.println("login by facebook test");
		AssertJUnit.assertEquals("Abhishek", "Abhishek"); //passed
		
		
		
	}

	
	@Test
	public void loginByTwitter() {
		
		System.out.println("login by twitter");
		AssertJUnit.assertEquals("Chrome", "chrome"); //failed
		
		
	}
}