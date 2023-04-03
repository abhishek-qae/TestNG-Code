package asserttuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class demoassert {

	public static void main(String[] args) throws InterruptedException {
		
		// String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\1118a\\TestNG-Code\\LearnTestNG\\Exe Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ui.cogmento.com/");

		WebElement useremail = driver.findElement(By.name("email"));

		Assert.assertTrue(useremail.isDisplayed());

		useremail.sendKeys("1118abhi@gmail.com");

		WebElement password = driver.findElement(By.name("password"));

		Assert.assertTrue(password.isDisplayed());

		password.sendKeys("Abhicrm1234");
		
		WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login']"));
		
		loginbutton.click();
		
		Thread.sleep(2000);
		
		String pagetitle = "Cogmento CRM";
		
		Assert.assertEquals(pagetitle, driver.getTitle());
		
		System.out.println("script passed");
		
		driver.quit();
	}

}
