package parameterstuts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parametersfile {
	
	@Parameters({"url"})
	@Test
	public void testPara1(String urlname) {
		
		System.out.println("first line for parameter ");
		System.out.println(urlname);
		
		
		
		
	}

	
	@Test
	public void testPara2() {
		
		System.out.println("second code for parameter");
		
		
		
	}
	
	
}