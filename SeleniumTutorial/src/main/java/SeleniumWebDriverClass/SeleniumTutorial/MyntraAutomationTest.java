package SeleniumWebDriverClass.SeleniumTutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraAutomationTest {

	private static final String PASSWORD = "Swastik@27";

	public static void main(String[] args) throws InterruptedException {
		
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.flipkart.com/");
	     WebDriver loginbutton= new WebDriver(driver.findElement(By.xpath("//a[text()='Login']")).click();
	     Thread.sleep(100);
	     driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9019283643");
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']//span[text()='Login']")).click();
	     
	     
	     
	   
	     		
	   
	       
	  	
	     

	}

}
