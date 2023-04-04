package screenshotdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotfile {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1118a\\TestNG-Code\\LearnTestNG\\Exe Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ui.cogmento.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\1118a\\screenshot.png"));
	}

}
