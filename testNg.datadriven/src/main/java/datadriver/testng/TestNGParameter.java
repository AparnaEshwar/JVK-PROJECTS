package datadriver.testng;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameter<WebDriver> {
	 WebDriver driver;
	 
	 @Test
	 @Parameter({"browser","url","email"})
	 
	 public void Googletesting(String browser, String url, String email )
	 {
		 System.setProperty("webdriver.chromedriver","D:\\chromedriver_win32.zip");
		 driver= new ChromeDriver();
	
	 }
	 
	 
	 
	

}
