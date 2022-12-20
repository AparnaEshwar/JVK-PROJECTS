package SeleniumWebDriverClass.SeleniumTutorial;

import java.time.Duration;
import java.util.Iterator;
//import java.util.Set;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutomationTesting {

	private static final String AmazonAutomationTesting = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("9019283643");
		driver.findElement(By.className("a-button-inner")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swastik@27");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("Apple iPhone");
		// driver.findElement(By.cssSelector("//a[class='a-link-normal s-underline-text
		// s-underline-link-text s-link-style a-text-normal']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro 256GB Space Black']")).click();
		Thread.sleep(1000);
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String AmazonAutomationTesting = iterator.next();
			System.out.println("--- " + AmazonAutomationTesting);
			if (!mainWindowHandle.equalsIgnoreCase(AmazonAutomationTesting)) {
				driver.switchTo().window(AmazonAutomationTesting);
				break;
			}
		}

		WebElement text = driver.findElement(By.xpath("//span[@id='productTitle']"));
		System.out.println("Amazon new Window is " + text.getText());
		driver.findElement(By.xpath("//div/img[@alt='Gold']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
	//	WebElement dropdown = driver.findElement(By.xpath("//select[@name='quantity.41bf5e90-46bf-45d8-9a44-7bd4fd600276']"));
	// quantity = new Select(dropdown);
	//	quantity.selectByIndex(1);
		//driver.findElement(By.xpath("//div[@id='buyNow']")).click();
		//driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		driver.findElement(By.xpath("//span[@class='pmts-instrument-selector']")).click();
		//driver.findElement(By.xpath("//a[@id='addressChangeLinkId']")).click();
		//driver.findElement(By.xpath("//input[@value='/gp/buy/addressselect/handlers/continue.html/ref=chk_addr_select_2_mru?ie=UTF8&action=select-shipping&addressID=UG66PTKEPLSTYP5AAEPAG124N7OQLBPRYA2SYRPBLQO7N40PXTQ2EIA2OXAUSLN2&enableDeliveryPreferences=1&fromAnywhere=0&numberOfDistinctItems=2&purchaseId=404-1268655-2168350&requestToken=']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		driver.findElement(By.xpath("//a[@id='pp-zfvn59-103']")).click();
		driver.findElement(By.xpath("//span[@class='pmts-indiv-issuer-image']")).click();
		//driver.findElement(By.xpath("//a[@id='pp-6JbQC1-103']")).submit();
		driver.findElement(By.xpath("//select[@id='pp-6JbQC1-109']")).click();
		driver.findElement(By.xpath("//a[@id='pp-6JbQC1-109_1']")).click();
		driver.findElement(By.xpath("//div[@class='a-column a-span9']")).sendKeys("4514570026495211");
		driver.findElement(By.xpath("//input[@name='ppw-accountHolderName']")).sendKeys("Aparna E");
		Select dropdown= new Select(driver.findElement(By.xpath("//span[@id='pp-74jKSP-22']")));
		dropdown.selectByIndex(10);
		Select dropdown1= new Select(driver.findElement(By.xpath("//span[@id='pp-74jKSP-23']")));
		dropdown1.selectByIndex(22);
		
		

	}

}
